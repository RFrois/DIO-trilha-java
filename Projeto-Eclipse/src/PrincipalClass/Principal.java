package PrincipalClass;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salarioPretendido;
		System.out.println("Enformar sua pretenção salarial ");
		
		salarioPretendido = entrada.nextDouble();
		
		if(ValidarSalario(salarioPretendido) == true) {
			System.out.println("Candidato Aprovado");
		}else if (ValidarSalario(salarioPretendido) == false) {
			System.out.println("Candidato Reprovado");
		}
		
		
		entrada.close();
	}


	public static boolean ValidarSalario(Double salarioPretendido) {
	
		double salarioBase = 2000.0;
		boolean validarSalario;
		
		if(salarioBase >= salarioPretendido) {
			validarSalario = true;
		}else {
			validarSalario = false;
		}
		
		return validarSalario;
	}
}

