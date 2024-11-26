package PrincipalClass.MapInterface.PesquisaProduto;

public class UsansoProdutoMap {
	
	public static void main(String[] args) {
		
		EstoqueProduto produto = new EstoqueProduto();
		
		produto.adicionarProduto( 1L, "Calça", 5, 50.0);
		produto.adicionarProduto( 2L, "Blusa", 6, 30.0);
		produto.adicionarProduto( 3L, "Meia", 7, 12.0);
		produto.adicionarProduto( 4L, "Cueca", 16, 19.90);
		produto.adicionarProduto( 5L, "Luva", 9, 20.0);
		
		System.out.println("Valor do estoque: " + produto.calcularValorTotalEstoque());
		
		produto.exibirProduto();
		
		System.out.println("Produto mais caro é: " + produto.obterProdutoMaisCaro());
	}

}
