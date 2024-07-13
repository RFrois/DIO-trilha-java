package edu.dioSantander.EstruturaCondicionais;

import java.util.Scanner;

public class CondicaoTernatio {
    public static void main(String[] args) {
         
        double nota1;
        double nota2;
        double notaMedia;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserir as notas 1 e 2:");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        notaMedia = (nota1 + nota2)/2;

        System.out.println("Nota média do aluno: " + notaMedia);
        teclado.close();

        String resultado = notaMedia > 7 ? "APROVADO" : "Reprovado";

        System.out.println(resultado);

        System.out.println("\n\n\n");

        String resultado2 = notaMedia >= 7 ? "APROVADO" : notaMedia >= 5 ? "RECUPERAÇÂO" : "REPROVADO";

        System.out.println(resultado2);
    }
    
}
