package edu.dioSantander.TiposVariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Tipos e variáveis, tipos numéricos booleanos e testo 
         * Núméricos short para números pequenos 
         * int para números médios 
         * long para números grandes 
         * double para números com casa decimal 
         * booleano para verdadeiro ou falso 
         * char para caracteres 
         * string para testo
         */

         short numeroPequeno = 15;
         int numeroMedio = 321654987;
         long numeroGrande = 123456789123L; //para usar o long tem que por o L no final do número 
         float numeroFlutuante = 123.45F; //tem que usar o F para float


         System.out.println(numeroFlutuante + "\n" + numeroGrande + "\n" + numeroMedio + "\n" + numeroPequeno);

         //se usado + em variáveis numéricas são somadas as variáveis 
         
         System.out.println("Resultado da soma: " + numeroFlutuante + numeroGrande + numeroMedio + numeroPequeno);

         //pode ser usado o + em caso de concatenar variáveis do tipo String 

         String primeiroNome = "Rafael";
         String segundoNome = "Frois";
         char letra = 'R';

         System.out.println(primeiroNome + " " + segundoNome + "\nLetra: " + letra);



    }
}
