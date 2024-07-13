package edu.dioSantander.EstruturaCondicionais;

public class EstruturaCondicionais {

    public static void main(String[] args) {
        double saldo = 100.0;
        double valorSolicitado = 17.0;

        System.out.println("Seu salado é: " + saldo);

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
        System.out.println("estrutura simples");

        //controle de fluxo simples 

        System.out.println("\n\n");

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        else 
            System.out.println("Saldo insuficiente");

        System.out.println(saldo);
        System.out.println("estrutura Composta");

        //controle de fluxo composto com else 

    }

}
