package PrincipalClass.OperacoesBasicas.OrdenacaoPessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoalist;

	public OrdenacaoPessoa() {
		this.pessoalist = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoalist.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoalist);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoalist);
		Collections.sort(pessoaPorAltura, new CompratorPorAltura());
		return pessoaPorAltura;
	}
	

}
