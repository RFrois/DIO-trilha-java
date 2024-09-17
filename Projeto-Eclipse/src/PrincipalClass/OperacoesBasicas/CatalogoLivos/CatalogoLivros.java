package PrincipalClass.OperacoesBasicas.CatalogoLivos;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anopublicacao) {
		livroList.add(new Livro(titulo, autor, anopublicacao));

	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livroPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
			
			return livroPorAutor;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livroPorAno = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorAno.add(l);
				}
			}
			return livroPorAno;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
			return livroPorTitulo;
		}
		else {
			throw new RuntimeException("A lista está vazia!");
		}
		
	}
	

}
