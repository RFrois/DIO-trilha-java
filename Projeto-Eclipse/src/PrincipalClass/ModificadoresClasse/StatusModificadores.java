package PrincipalClass.ModificadoresClasse;

public enum StatusModificadores {
	PRIVATE ("private","PV"),
	DEFALT ("defalt","DF"),
	PROTECTED ("protected","PT"),
	PUBLIC ("public","PB")
	;

	
	private String status;
	private String nome;
	
	
	private StatusModificadores(String nome, String status) {
		this.nome = nome;
		this.status = status;
	}


	public String getStatus() {
		return status;
	}
	public String getNome() {
		return nome;
	}


	public String getNomeMaiusculo() {
		return nome.toUpperCase();
		
	}

	
	
}
