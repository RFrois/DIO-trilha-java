package edu.dioSantander.EstruturaRepeticao;

public class forParaArrays {
public static void main(String[] args) {
    
    String alunos [] = {"Rafael", "Gabriel", "Isaac", "Alex", "Heitor"};

    for (int x=0; x<alunos.length; x++){
        System.out.println("alunos: " + alunos[x]);
    }


    for (String aluno : alunos) {
        System.out.println("Alunos simples: " + aluno);
    }
}
}
