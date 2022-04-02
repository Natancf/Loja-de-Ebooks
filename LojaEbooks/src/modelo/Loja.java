package modelo;


public class Loja {
	private Ebook ebooks;
	private Leitor leitorId;
	private Estante estante;
	
	public Loja() {
		super();
	}
	
	public Loja(Ebook eb, Leitor lId, Estante es) { // Construtor Ebook
		this.ebooks = eb;
		this.leitorId = lId;
		this.estante = es;
	}

	public Ebook getEbooks() {
		return ebooks;
	}

	public void setEbooks(Ebook ebooks) {
		this.ebooks = ebooks;
	}

	public Leitor getLeitorId() {
		return leitorId;
	}

	public void setLeitorId(Leitor leitorId) {
		this.leitorId = leitorId;
	}

	public Estante getEstante() {
		return estante;
	}

	public void setEstante(Estante estante) {
		this.estante = estante;
	}
	
}
