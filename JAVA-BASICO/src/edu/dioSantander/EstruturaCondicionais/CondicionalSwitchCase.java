package edu.dioSantander.EstruturaCondicionais;

import java.util.Scanner;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        
        String sigla;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Tamanho do Produto P, M, G: ");

        sigla = teclado.nextLine();

        sigla = sigla.toUpperCase();

        System.out.println(sigla);

        switch (sigla) {
            case "P":{
                System.out.println("Tamanho Pequeno");
                break;
            }
            case "M":{
                System.out.println("Tamanho Médio");
                break;
            }
            case "G":{
                System.out.println("Tamanho Grande");
                break;
            }
        
            default:
            System.out.println("Favor digitar os Tamanhos P, M, G");
                break;
        }
        teclado.close();
    }

}
