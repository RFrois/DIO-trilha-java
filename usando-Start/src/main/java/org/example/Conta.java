package org.example;

public class Conta {

    private int contaOrigem;
    private double saldo;


    public Conta(int contaOrigem, double saldo) {
        this.contaOrigem = contaOrigem;
        this.saldo = saldo;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
