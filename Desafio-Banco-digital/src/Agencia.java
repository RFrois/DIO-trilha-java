import java.util.ArrayList;
import java.util.List;

public class Agencia {


	Banco banco;

	public void AdicionarAgencia(Banco banco) {
		int agencia1;
		

		switch (estado) {
		case "São Paulo":
			agencia1 = 1000;
			agencia = agencia1++;
			banco.setAgencia(agencia);
			break;
		case "Rio de Janeiro":
			agencia1 = 1500;
			agencia = agencia1++;
			banco.setAgencia(agencia);
			break;
		case "Minas Gerais":
			agencia1 = 1500;
			agencia = agencia1++;
			banco.setAgencia(agencia);
			break;

		default:
			System.out.println("Não atuamos nesse estado!");
			break;
			
			}
	}
	public void ImprimirAgencia() {
		Banco banco;
			System.out.println(banco.getCODBANCO());
	}

}
