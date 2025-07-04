package Strategy_DIO;

public class Robo implements Comportamento{

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    @Override
    public void mover() {
        comportamento.mover();
    }
}
