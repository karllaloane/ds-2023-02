# Atividade 1

Um software que lê um arquivo no formato CSV e, para cada linha, calcula a soma das duas primeiras colunas e gera um arquivo CSV, contendo as mesmas linhas, mas o arquivo gerado contém uma coluna adicional que a soma obtida para cada linha. 

## Descrição Geral

- O software deve receber como entrada o arquivo CSV que contém os dados a serem processados.
- O software irá percorrer cada linha do arquivo criado
    - Para cada linha, deve extrair os valores das duas primeiras colunas (supõe-se que sejam valores numéricos) e calcular a soma desses valores.
    - Para cada linha percorrida, escreve a linha no arquivo de saída e adiciona a soma como uma nova coluna.
- O software retorna o novo CSV criado.

## Considerando o funcionamento do programa por completo, e fornecendo uma descrição mais detalhada:

1. O software solicita ao usuário o arquivo CSV de entrada.
2. O software verifica se o arquivo de entrada existe.
4. Se não existir, exibe uma mensagem de erro e encerre o programa.

5. O software cria um arquivo CSV para saída dos dados.

6. Para cada linha no arquivo de entrada:
    6.1. Leia a linha do arquivo de entrada.
    6.2. Separe os valores da linha em colunas.
    6.3. Calcule a soma dos valores das duas primeiras colunas.
    6.4. Escreva a linha no arquivo de saída.
    6.5. Adicione a soma como uma nova coluna na linha.

7. Feche ambos os arquivos (entrada e saída).

8. Exiba uma mensagem informando que a operação foi concluída com sucesso e que o arquivo de saída foi gerado.
