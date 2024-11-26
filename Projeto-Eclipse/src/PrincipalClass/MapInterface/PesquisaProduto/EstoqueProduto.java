package PrincipalClass.MapInterface.PesquisaProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProduto() {
		super();
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(Long cod, String nome, Integer quantidade, Double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProduto() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque; 
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
					
				}
			}
		}
		return produtoMaisCaro;
	}
}
