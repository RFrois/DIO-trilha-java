package PrincipalClass.StreamAPI.InterfaceConsumer;

import java.util.List;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Suplier {

	public static void main(String[] args) {
		
		//Usar o Suplier com expressão lambda para fornecer uma saudação personalizada 
		//Supplier<String> saudacao = () ->"olá, seja bem-vindo(a)!";
		
		//Usar o Suppplier para obter uma lista com 5 saudações 
		//List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		
		//Usanndo Lambda
		List<String> listaSaudacoes = Stream.generate(() -> "olá, seja bem-vindo(a)!").limit(5).collect(Collectors.toList());
		
		//Imprimir as saudações geradas 
		listaSaudacoes.forEach(s ->System.out.println(s));
	}
}
