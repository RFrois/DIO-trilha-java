package PrincipalClass.OperacoesBasicas.CatalogoLivos;

public class Livro {
	
	private String livro;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.livro = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return livro;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [livro=" + livro + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	

}
