package Principal;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate date;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	

	public Mentoria() {
		super();
	}



	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentoria [date=" + date + ", calcularXp()=" + calcularXp() + ", getDate()=" + getDate()
				+ ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
	}
	
	

}
