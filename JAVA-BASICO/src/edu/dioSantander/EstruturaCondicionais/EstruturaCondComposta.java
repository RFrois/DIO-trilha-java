package edu.dioSantander.EstruturaCondicionais;

import java.util.Scanner;

public class EstruturaCondComposta {

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

        if (notaMedia > 7){
            System.out.println("Aluno APROVADO");
        }else if (notaMedia < 7 && notaMedia >= 5) {
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno REPROVADO");
        }

        //estrutura encadeada 

    }
    
}
