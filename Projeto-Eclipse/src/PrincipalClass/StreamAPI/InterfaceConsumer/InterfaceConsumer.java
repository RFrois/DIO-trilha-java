package PrincipalClass.StreamAPI.InterfaceConsumer;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;


public class InterfaceConsumer {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		// Usar o Consumer com expressão lambda para imprimir números pares 
		/*
		 * Consumer<Integer> imprimirNumeroPar = numero -> { if (numero % 2 == 0) {
		 * System.out.println(numero); } };
		 */
		// Usando o Consumer para imprimir números pares no Stream
		numeros.stream().filter(n -> n % 2 == 0).forEach(n ->  {
				if (n % 2 ==0) {
					System.out.println(n);
				}
				
			}
		);
	}

}
