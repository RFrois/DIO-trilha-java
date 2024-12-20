package Principal;

public class Curso extends Conteudo {
	
	private int cargaHoraria;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	

	public Curso() {
		super();
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", calcularXp()=" + calcularXp() + ", getCargaHoraria()="
				+ getCargaHoraria() + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao()
				+ "]";
	}

	
	
}
