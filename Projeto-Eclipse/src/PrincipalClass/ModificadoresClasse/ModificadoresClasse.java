package PrincipalClass.ModificadoresClasse;

import java.util.Scanner;

public class ModificadoresClasse {
	
	public static void main(String[] args) {
		
		MsgModificadores msg = new MsgModificadores("Com o construtor!");
		Scanner entrada = new Scanner(System.in);
		String num = "0";		
		StatusModificadores status;
		
		msg.setMsgPrivate("Disponivel para classe");
		msg.setMsgDefault("Dispovivel para classes do mesmo pacote");
		msg.setMsgProteced("Disponivel para classe, subclasse do pacote");
		msg.setMsgPublic("Disponivel para todo o projeto");
		
		
		
		
		while (!num.equalsIgnoreCase("5")) {
			System.out.println("Tipos de modificadores: " + msg.getMsgInicio());
			for(StatusModificadores i :StatusModificadores.values()) {
				System.out.println("Status dos Modificadores: " + i);
			}			
		num = entrada.nextLine();
		if("1".equalsIgnoreCase(num)) {
			status = StatusModificadores.PRIVATE;
			System.out.println(status + ": " + msg.getMsgPrivate() + "\n");
		}
		else if("2".equalsIgnoreCase(num)) {
			status = StatusModificadores.DEFALT;
			System.out.println(status + ": " + msg.getMsgDefault() + "\n");
		}
		else if("3".equalsIgnoreCase(num)) {
			status = StatusModificadores.PROTECTED;
			System.out.println(status + ": " + msg.getMsgProteced() + "\n");
		}
		else if("4".equalsIgnoreCase(num)) {
			status = StatusModificadores.PUBLIC;
			System.out.println(status + ": " + msg.getMsgPublic() + "\n");
		}
		else if("5".equalsIgnoreCase(num)) {
			System.out.println("Finalizado");
		}
		else {
			System.out.println("Opção inválida");
		}
		}
		entrada.close();
	}

}
