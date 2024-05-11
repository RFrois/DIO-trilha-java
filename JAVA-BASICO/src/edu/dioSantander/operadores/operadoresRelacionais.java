package edu.dioSantander.operadores;

public class operadoresRelacionais {


    public static void main(String[] args) {
        

         int numero1 = 4;
         int numero2 = 6;

         boolean simNao = numero1 == numero2;

         String resultado = String.valueOf(simNao);
         int resultado2;

         if (numero1 < numero2) {

            resultado2 = 1;
            resultado2 = resultado2 + numero1;

            System.out.println( resultado2);
            
         }

         System.out.println("Número 1 é igual ao número2? " + simNao);

         simNao = numero1 != numero2;

         System.out.println("Número 1 é igual ao número2? " + simNao);

         System.out.println(resultado);

         switch (resultado) {
            case "treu":

                System.out.println("Verdade Moleque");                
                break;

            case "false":

                System.out.println("Não foi dessa vez");
                break;
         
            default:

                System.out.println("Vixi deu não!");
                break;
         }
    }

}
