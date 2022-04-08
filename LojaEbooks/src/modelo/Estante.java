package modelo;

import java.util.List;

/**
 * Classe modelo de estante
 * 
 * @author Natanael Costa de Freitas
 */
public class Estante {
	private Ebook[] ebooksComprados;
	private String categoria;
	private String estanteId;
	private String leitorId;
	
	// Construtores
	public Estante() {
		super();
	}
	
	public Estante(Ebook[] ebooks, String cat, String esId, String Id) {
		this.ebooksComprados = ebooks;
		this.categoria = cat;
		this.estanteId = esId;
		this.leitorId = Id;
	}

	// Gets e Sets
	public Ebook[] getEbooksComprados() {
		return ebooksComprados;
	}

	public void setEbooksComprados(Ebook[] estante) {
		this.ebooksComprados = estante;
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
