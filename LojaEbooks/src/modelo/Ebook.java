package modelo;

import java.util.Date;


public class Ebook {
	private String idEbook;
	private String titulo;
	private String genero;
	private String nomeAutor;
	private String descricao;
	private Date anoDePublicacao;
	private String idioma;
	private double preco;
	private Editora editora;

	public Ebook() {
		super();
	}
	
	public Ebook(String id, String t, String g, String na, String de, Date da, String i, double p, Editora e) { // Construtor Ebook
		this.idEbook = id;
		this.titulo = t;
		this.genero = g; 
		this.nomeAutor = na;
		this.descricao = de;
		this.anoDePublicacao = da;
		this.idioma = i;
		this.preco = p;
		this.editora = e;
	}

	// Gets e Sets
	public String getIdEbook() {
		return idEbook;
	}

	public void setIdEbook(String idEbook) {
		this.idEbook = idEbook;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
}

