import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String conta;
        String agencia;
        String nomeCliente;
        Double saldo;
        Agencia agencia2 = new Agencia();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua Agência: ");
        agencia = entrada.nextLine();
        if (agencia2.Agencia(agencia) == true){

            System.out.println("Agencia correta,\nDigite a conta: ");
        }else{
            System.out.println("Agencia errada!");
        }if (agencia2.Agencia(agencia) == true){
            System.out.println("DIgite sua conta: ");
            conta = entrada.nextLine();     
                   
        }else{
            conta = null;
        }
        System.out.println("Digite seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.println("Qual o valo que deseja depositar: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é " + saldo + "\njá está disponível para saque");


        entrada.close();


    }
}
