package modelo;

public class Estante {
	private Ebook[] ebooksComprados;
	private String categoria;
	private String estanteId;
	private String leitorId;
	
	public Estante(Ebook[] e, String cat, String esId, String Id) { // Construtor classe Estante
		this.ebooksComprados = e;
		this.categoria = cat;
		this.estanteId = esId;
		this.leitorId = Id;
	}

	// Gets e Sets
	public Ebook[] getEbooksComprados() {
		return ebooksComprados;
	}

	public void setEbooksComprados(Ebook[] ebooksComprados) {
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

	public String getLeitorId() {
		return leitorId;
	}

	public void setLeitorId(String leitorId) {
		this.leitorId = leitorId;
	}
	
}
