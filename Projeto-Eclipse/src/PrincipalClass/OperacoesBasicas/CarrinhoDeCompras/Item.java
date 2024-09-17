package PrincipalClass.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
	
	private String nome;
	private Double preco;
	private Integer Quantidade;
	
	public Item(String nome, Double preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		Quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	@Override
	public String toString() {
		return "nome = " + nome + "\npreco = " + preco + "\nQuantidade = " + Quantidade + "\n";
	}

	
	

}
