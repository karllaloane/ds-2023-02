import org.example.Endereco;
import org.junit.Test;

public class EnderecoTest {

    @Test
    public void testBuilderComUmAtributo() {
        Endereco endereco = Endereco.builder()
                .rua("Rua A")
                .build();

        assert endereco.getRua().equals("Rua A");
        assert endereco.getSetor() == null;
        assert endereco.getCep() == null;
        assert endereco.getNumero() == 0;
        assert endereco.getCidade() == null;
        assert endereco.getEstado() == null;
        assert endereco.getBloco() == null;
        assert endereco.getQuadra() == null;
    }

    @Test
    public void testBuilderComDoisAtributos() {
        Endereco endereco = Endereco.builder()
                .rua("Rua A")
                .setor("Setor 1")
                .build();

        assert endereco.getRua().equals("Rua A");
        assert endereco.getSetor().equals("Setor 1");
        assert endereco.getCep() == null;
        assert endereco.getNumero() == 0;
        assert endereco.getCidade() == null;
        assert endereco.getEstado() == null;
        assert endereco.getBloco() == null;
        assert endereco.getQuadra() == null;
    }

    @Test
    public void testBuilderComTresAtributos() {
        Endereco endereco = Endereco.builder()
                .rua("Rua A")
                .setor("Setor 1")
                .estado("Goias")
                .build();

        assert endereco.getRua().equals("Rua A");
        assert endereco.getSetor().equals("Setor 1");
        assert endereco.getCep() == null;
        assert endereco.getNumero() == 0;
        assert endereco.getCidade() == null;
        assert endereco.getEstado().equals("Goias");
        assert endereco.getBloco() == null;
        assert endereco.getQuadra() == null;
    }

    @Test
    public void testBuilderComQuatroAtributos() {
        Endereco endereco = Endereco.builder()
                .rua("Rua A")
                .estado("Goias")
                .quadra("2")
                .numero(1)
                .build();

        assert endereco.getRua().equals("Rua A");
        assert endereco.getSetor() == null;
        assert endereco.getCep() == null;
        assert endereco.getNumero() == 1;
        assert endereco.getCidade() == null;
        assert endereco.getEstado().equals("Goias");
        assert endereco.getBloco() == null;
        assert endereco.getQuadra().equals("2");
    }

    @Test
    public void testBuilderComTodosAtributos() {
        Endereco endereco = Endereco.builder()
                .rua("Rua A")
                .setor("Setor")
                .cep("77777-000")
                .numero(1)
                .cidade("Goiania")
                .estado("Goias")
                .bloco("D")
                .quadra("2")

                .build();

        assert endereco.getRua().equals("Rua A");
        assert endereco.getSetor().equals("Setor");
        assert endereco.getCep().equals("77777-000");
        assert endereco.getNumero() == 1;
        assert endereco.getCidade().equals("Goiania");
        assert endereco.getEstado().equals("Goias");
        assert endereco.getBloco().equals("D");
        assert endereco.getQuadra().equals("2");
    }
}
