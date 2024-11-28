
public class Main {

	public static void main(String[] args) {

		Cliente rafael = new Cliente();
		rafael.setNome("rafael");
		rafael.setCpf("01020304050");

		Conta cc = new ContaCorrente(rafael);
		Conta poupanca = new ContaPoupanca(rafael);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.imprimirInfosComuns();
		
		Banco rfrois = new Banco();
		rfrois.setNome("rfrois");
		rfrois.setEstado("São Paulo");
		Agencia novaAgencia = new Agencia(rfrois);
		novaAgencia.AdicionarAgencia(rfrois);
		novaAgencia.ImprimirAgencia3();

	}

}
