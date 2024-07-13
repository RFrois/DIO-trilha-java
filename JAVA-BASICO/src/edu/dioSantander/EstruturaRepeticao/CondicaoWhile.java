package edu.dioSantander.EstruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class CondicaoWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            //for(int n = ; )

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1,8);
    }

}
