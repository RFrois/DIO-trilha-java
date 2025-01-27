import org.example.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTeste {

    @Test
    void classeCliente(){
        Cliente cliente = new Cliente();

        cliente.setNome("Rafael");
        cliente.setId(1);
        Assertions.assertEquals(1,cliente.getId());
        }
    }
