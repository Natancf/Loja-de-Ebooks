package modelo;

public class Estante {
	private Ebook ebooksComprados;
	private String categoria;
	private String estanteId;
	private Leitor leitorId;
	
	public Estante(Ebook ebc, String cat, String esId, Leitor lId) { // Construtor classe Estante
		this.ebooksComprados = ebc;
		this.categoria = cat;
		this.estanteId = esId;
		this.leitorId = lId;
	}

	// Gets e Sets
	public Ebook getEbooksComprados() {
		return ebooksComprados;
	}

	public void setEbooksComprados(Ebook ebooksComprados) {
		this.ebooksComprados = ebooksComprados;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstanteId() {
		return estanteId;
	}

	public void setEstanteId(String estanteId) {
		this.estanteId = estanteId;
	}

	public Leitor getLeitorId() {
		return leitorId;
	}

	public void setLeitorId(Leitor leitorId) {
		this.leitorId = leitorId;
	}
	
}
