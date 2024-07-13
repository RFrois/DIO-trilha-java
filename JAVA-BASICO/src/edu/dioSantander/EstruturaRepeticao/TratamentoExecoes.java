package edu.dioSantander.EstruturaRepeticao;

import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExecoes {
public static void main(String[] args) throws IOException, ParseException, InputMismatchException{
    
    Scanner entrada = new Scanner(System.in);
    int numero;
    int[] numeros = {1,2,3,4};
    

    
    
    try {
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println("Numero na lista " + numeros[numero]);
    }catch (InputMismatchException e) {
        System.out.println("Favor digitar números");
        System.out.println("Digite um numero: ");
    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Numero fora do intervalo");
    }
    entrada.close();
}
}
