import org.example.ConexaoBanco;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TesteBanco {

    @BeforeAll
    static void configuraConexao(){
        ConexaoBanco banco = new ConexaoBanco();
        banco.iniciarConexao();
    }

    @BeforeEach
    void inserirDadosDeTeste(){
        ConexaoBanco banco = new ConexaoBanco();
        banco.inserirDados(new Pessoa("Rafael", LocalDateTime.of(1989,1,16,16,45),"33899778804"));
    }

    @AfterEach
    void removerDadosDeTeste(){
        ConexaoBanco banco = new ConexaoBanco();
        banco.removeuDados(new Pessoa("Rafael", LocalDateTime.of(1989,1,16,16,45),"33899778804"));
    }

    @DisplayName("Artigo 2")
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @DisplayName("Artigo")
    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        ConexaoBanco banco = new ConexaoBanco();
        banco.finalizarConexao();
    }
}
