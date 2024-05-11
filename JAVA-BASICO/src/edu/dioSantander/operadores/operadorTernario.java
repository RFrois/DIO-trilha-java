package edu.dioSantander.operadores;

public class operadorTernario {

    public static void main(String[] args) {
        

        String nome = "GABRIEL";
        String segundoNome = "Frois";

        nome = "gabriel".equalsIgnoreCase(nome) ? "Gabriel" : "Errou";
        
        String resultado = nome + " " + segundoNome ;

        System.out.println(resultado);



        int a,b;

        a = 5;
        b = 5;
        String c = (b+a) == 9 ? "Certo" : "DEU RUIM";

        System.out.println(c);
        

    }

}
