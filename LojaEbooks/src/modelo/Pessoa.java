package modelo;

public abstract class Pessoa { // Classe abstrata pessoa pai de Editora e Leitor
	protected String id;
	protected String nome;
	protected String email;
	protected String senha;
	protected Telefone numeroTelefone;
	
	// Gets e Sets
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Telefone getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(Telefone numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	// Metodo que nas subsclasses, retorna TRUE se for Editora e FALSE se for Leitor
		public abstract boolean isAdmin();
	
}
