import Facede.Facede;
import Strategy_DIO.*;
import Teste_01.Cliente;

public class Main {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        numero1 = 1;
        numero2 = 2;
        if (numero1 > numero2) {
            System.out.println("Gabriel Cara de pastel");
        } else {
            System.out.println("Rafael o mais lindo");
        }

        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");
        cliente.setId(1);

        System.out.println("Nome " + cliente.getNome() + " ID " + cliente.getId());

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();


        Facede facede = new Facede();
        facede.migrarCliente("Rafael", "02995250");
    }
}