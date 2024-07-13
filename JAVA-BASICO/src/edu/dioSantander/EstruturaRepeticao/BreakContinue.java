package edu.dioSantander.EstruturaRepeticao;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de parada: de 1 a 5:");
        int numero = entrada.nextInt();

        for(int numero2 = 0; numero2 <= 5; numero2 ++){
            if(numero2 == numero)
            break;

            System.out.println("Break: " + numero);
        } // Break para na condição 

        for(int numero1 = 0; numero1 <= 5; numero1 ++){
            if(numero1 == numero)
            continue;

            System.out.println("Continue: " + numero1);
        } // continue pula a condição do continue

        entrada.close();
    }

}
