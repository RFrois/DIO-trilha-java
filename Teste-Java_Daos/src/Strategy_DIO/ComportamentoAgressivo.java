package Strategy_DIO;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movimento Agressivamente...");
    }
}
