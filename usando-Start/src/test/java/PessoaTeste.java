import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void calcularIdadeCorreta(){

        Pessoa pessoa = new Pessoa("Rafael", LocalDateTime.of(1989,1,16,16,45),"33899778804");
        Assertions.assertEquals(36, pessoa.calcularIdade(pessoa.getNascimento()));

        Pessoa pessoa2 = new Pessoa("Gabriel", LocalDateTime.of(2018,2,24,19,20),"26523523202");
        Assertions.assertEquals(6, pessoa2.calcularIdade(pessoa2.getNascimento()));
    }

    @Test
    void maiorIdade(){
        Pessoa pessoa = new Pessoa("Rafael", LocalDateTime.of(1989,1,16,16,45),"33899778804");
        Assertions.assertTrue(pessoa.meiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Gabriel", LocalDateTime.of(2018,2,24,19,20),"26523523202");
        Assertions.assertFalse(pessoa2.meiorDeIdade());
    }
}
