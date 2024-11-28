import java.util.ArrayList;
import java.util.List;

public class Agencia {


	Banco banco;
	// protected Banco agencia;

	public Agencia(Banco banco) {
		this.banco = banco;
	}

	public void AdicionarAgencia(Banco banco) {
		int agencia1;

		
		switch (banco.getEstado()) {
		case "São Paulo":
			agencia1 = 1001;
			// agencia = agencia1++;
			banco.setAgencia(agencia1++);
			break;
		case "Rio de Janeiro":
			agencia1 = 1501;
			// agencia = agencia1++;
			banco.setAgencia(agencia1++);
			break;
		case "Minas Gerais":
			agencia1 = 1501;
			// agencia = agencia1++;
			banco.setAgencia(agencia1++);
			break;

		default:
			System.out.println("Não atuamos nesse estado!");
			break;

		}

	}

	public void ImprimirAgencia3() {
		System.out.println(String.format("Banco: %s", this.banco.getNome()));
		System.out.println(String.format("Agencia: %d", this.banco.getAgencia()));
	}

}
