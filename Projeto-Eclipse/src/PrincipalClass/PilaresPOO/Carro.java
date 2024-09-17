package PrincipalClass.PilaresPOO;

public class Carro extends Veiculo{
	
	public void ligar() {
		ConferirPainel();
		ConferirCombustivel();
		ConferirLuzes();
		System.out.println("Chassi" + getChassi());
		System.out.println("Carro ligado");
	}
	private void ConferirCombustivel() {
		System.out.println("Combustivel OK");
		
	}
	private void ConferirPainel() {
		System.out.println("Painel OK");
	}
	private void ConferirLuzes() {
		System.out.println("Luzes OK");
	}

}
