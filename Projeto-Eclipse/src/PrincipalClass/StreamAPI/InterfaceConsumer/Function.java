package PrincipalClass.StreamAPI.InterfaceConsumer;

import java.util.Arrays;
import java.util.List;

public class Function {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		// Usar a function com expressão lambda para dobrar todos os números
		//java.util.function.Function<Integer, Integer> dobrar = numero -> numero *2;
		
		// Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
		// List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
		
		// Usando lambda
		List<Integer> numerosDobrados = numeros.stream().map(n -> n *2).toList();
		
		// Imprimir a lista de números dobrados
		 numerosDobrados.forEach(n -> System.out.println("Lambda " + n));
		// method reference
		numerosDobrados.forEach(System.out::println);
		
	}
}
