package Strategy_DIO;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movimento Defensivamente...");
    }
}
