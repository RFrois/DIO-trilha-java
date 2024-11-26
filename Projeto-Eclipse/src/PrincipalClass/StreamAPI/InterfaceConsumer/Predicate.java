package PrincipalClass.StreamAPI.InterfaceConsumer;

import java.util.Arrays;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		
		//Criar uma lista de palavras 
		List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
		
		// Criar um Predicate que verificaa se a palavra tem mais de 5 caracteres
		
		java.util.function.Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		// Usar o Stream para filtrar as palavras com mais de 5 caracteres e em seguida imprimir cada palavra que passou no filtro 
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
	}
}