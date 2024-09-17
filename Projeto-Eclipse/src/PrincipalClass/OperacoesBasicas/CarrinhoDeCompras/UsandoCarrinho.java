package PrincipalClass.OperacoesBasicas.CarrinhoDeCompras;

public class UsandoCarrinho {
	
	public static void main(String[] args) {
		CarrinhoDeCompras comprar = new CarrinhoDeCompras();
		
		comprar.adicionarItem("Rafael", 20.00, 3);
		comprar.adicionarItem("Rafael", 20.00, 3);
		comprar.adicionarItem("Gabriel", 28.00, 1);
		comprar.adicionarItem("Isaac", 32.00, 2);
		
		comprar.exibirItens();
		
		comprar.calcularValorTotal();
		
	}

}
