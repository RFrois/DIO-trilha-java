import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	private String estado;
	private int agencia;

	
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia1) {
		this.agencia = agencia1;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", contas=" + contas + ", estado=" + estado + ", agencia=" + agencia + "]";
	}
	
	

}
