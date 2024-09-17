package PrincipalClass.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaDeItens;

	public CarrinhoDeCompras() {
		this.listaDeItens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		listaDeItens.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> removerTarefas = new ArrayList<>();
		if (removerTarefas.isEmpty()) {
			for (Item l : listaDeItens) {
				if (l.getNome().equalsIgnoreCase(nome)) {
					removerTarefas.add(l);
				}
			}
			listaDeItens.removeAll(removerTarefas);
		} else
			System.out.println("Lista Vazia ");

	}

	public double calcularValorTotal() {
		double valorCalculado = 0d;
		List<Item> calcularPreco = new ArrayList<>();
		if (calcularPreco.isEmpty()) {
			for (Item p : listaDeItens) {
				if (p.getPreco() != 0) {
					valorCalculado = p.getPreco() * p.getQuantidade();
				}
			}
		} else {
			System.out.println("Lista está vazia ");
		}
		return valorCalculado;
	}
	
	public void exibirItens() {
		System.out.println(listaDeItens);
	}
  
}
