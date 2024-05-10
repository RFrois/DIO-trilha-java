package edu.dioSantander.operadores;

public class operadores {

    public static void main(String[] args) {
        
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        while (numero != 0) {

            System.out.println("Diferênte de 0");

         if (numero > 0) {

            numero = subtrair(numero);

            System.out.println(numero);
            
        }else if (numero < 0) {
            
            numero = somar(numero); 

            System.out.println(numero);
            
        }
    }if (numero == 0) {
    
        System.out.println("Número ZERO");
    }

               


    }

    
    public static int somar(int numero1){

        numero1 ++;

       // System.out.println(numero1);

        return numero1;
    }

    public static int subtrair(int numero2){

        numero2 --;

        return numero2;
    }
    

}
