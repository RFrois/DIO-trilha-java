package edu.dioSantander.EstruturaRepeticao;

public class EstruturaFor {
    
    public static void main(String[] args) {
        for (int carneirinhos = 0; carneirinhos <= 10; carneirinhos ++){
            System.out.println("contando carneirinhos: " + carneirinhos);
        }

      //  for (nome.Cliente) 

      for (int i = 0; i < 10; i++){
        if (i < 5){
            System.out.println("Iniciante");;
        }else if (i < 10){
            System.out.println("Intermediário");
        }
      }

    }
    
    public static String cliente(String numero) {
        String nome;

        switch (numero) {
            case "1":
                nome = "Humberto";
                break;
            case "2":
                nome = "Regis";
                break;
            case "3":
                nome = "João";
                break;
            default:
                nome = "Inválido";
                break;
        }

        return nome;
    }
}
