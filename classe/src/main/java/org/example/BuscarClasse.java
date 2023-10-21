package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class BuscarClasse {

    public static List<String> procurarClasse(String nomeDaClasse, String caminhoDoDiretorio, boolean flagParallelStream) {
        List<String> locaisEncontrados = new ArrayList<>();
        File diretorio = new File(caminhoDoDiretorio);

        if (!diretorio.exists()) {
            System.out.println("O diretório especificado não existe.");
            return locaisEncontrados;
        }

        //locaisEncontrados passado como parâmetro para fazer a recursão dos diretórios
        try {
            buscarNoDiretorio(diretorio, nomeDaClasse, locaisEncontrados, flagParallelStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return locaisEncontrados;
    }

    private static void buscarNoDiretorio(File diretorio, String nomeClasse, List<String> locaisEncontrados, boolean flagParallelStream) throws IOException {

        File[] files = diretorio.listFiles();
        if (files == null) {
            return;
        }

        if(flagParallelStream){
            Stream<File> fileStream = findFilesParallel(diretorio);
            buscarNoDiretorioParallel(fileStream.parallel(), nomeClasse, locaisEncontrados, flagParallelStream);
        } else {
            Stream<File> fileStream = findFiles(diretorio);
            buscarNoDiretorioComStream(nomeClasse, locaisEncontrados, flagParallelStream, fileStream);

        }

    }

    private static void buscarNoDiretorioComStream(String nomeDaClasse, List<String> locaisEncontrados, boolean flagParallelStream, Stream<File> fileStream) {

        fileStream
                .forEach(file -> {
                    if (file.isDirectory()) {
                        try {
                            buscarNoDiretorio(file, nomeDaClasse, locaisEncontrados, flagParallelStream);

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (file.getName().endsWith(".class")) { //se for um arquivo .class
                        String filePath = file.getAbsolutePath();

                        if (file.getName().contains(nomeDaClasse)) {
                            locaisEncontrados.add(filePath);
                        }

                    } else if (file.getName().endsWith(".jar") || file.getName().endsWith(".war")) {

                        List<String> classesInArchive = procurarClassesNoArquivo(file, nomeDaClasse);
                        locaisEncontrados.addAll(classesInArchive);
                    }
                });
    }

    private static void buscarNoDiretorioParallel(Stream<File> fileStream, String nomeDaClasse, List<String> locaisEncontrados, boolean flagParallelStream) {

        fileStream.parallel()
                .forEach(file -> {
                    if (file.isDirectory()) {
                        try {
                            buscarNoDiretorio(file, nomeDaClasse, locaisEncontrados, flagParallelStream);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (file.getName().endsWith(".class")) {
                        String filePath = file.getAbsolutePath();

                        if (file.getName().contains(nomeDaClasse)) {
                            locaisEncontrados.add(filePath);
                        }

                    } else if (file.getName().endsWith(".jar") || file.getName().endsWith(".war")) {

                        List<String> classesNoArquivo = procurarClassesNoArquivo(file, nomeDaClasse);
                        locaisEncontrados.addAll(classesNoArquivo);
                    }
                });
    }

    private static List<String> procurarClassesNoArquivo(File arquivo, String nomeClasse) {
        List<String> locaisEncontrados = new ArrayList<>();

        try {
            if (arquivo.getName().endsWith(".jar")) {
                procurarEmArquivoJar(arquivo, nomeClasse, locaisEncontrados);

            } else if (arquivo.getName().endsWith(".war")) {
                procurarEmArquivoWar(arquivo, nomeClasse, locaisEncontrados);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return locaisEncontrados;
    }

    private static void procurarEmArquivoWar(File arquivo, String nomeDaClasse, List<String> locaisEncontrados) throws IOException {
        ZipFile warFile = new ZipFile(arquivo);
        Enumeration<? extends ZipEntry> entradas = warFile.entries();

        verificarEntradasArquivo(arquivo, nomeDaClasse, locaisEncontrados, entradas);
        warFile.close();
    }

    private static void procurarEmArquivoJar(File arquivo, String nomeDaClasse, List<String> locaisEncontrados) throws IOException {
        JarFile jarFile = new JarFile(arquivo);
        Enumeration<JarEntry> entradas = jarFile.entries();

        verificarEntradasArquivo(arquivo, nomeDaClasse, locaisEncontrados, entradas);

        jarFile.close();
    }

    private static void verificarEntradasArquivo(File arquivo, String nomeDaClasse, List<String> locaisEncontrados, Enumeration<? extends ZipEntry> entries) {

        while (entries.hasMoreElements()) {
            ZipEntry entradas = entries.nextElement();
            if (entradas.getName().endsWith(".class")) {
                String qualifiedClassName = entradas.getName().replace("/", ".").replace(".class", "");
                if (qualifiedClassName.contains(nomeDaClasse)) {
                    locaisEncontrados.add(arquivo.getAbsolutePath() + " - " + qualifiedClassName);
                }
            }
        }
    }


    private static Stream<File> findFiles(File directory) throws IOException {
        return Stream.of(directory.listFiles());
    }

    private static Stream<File> findFilesParallel(File directory) throws IOException {
        System.out.println("Teste: Buscando paralelo");
        return Stream.of(directory.listFiles()).parallel();
    }
}
