package modelo;

import java.util.Date;

/**
 * Classe modelo de cartão 
 *  
 * @author Natanael Costa de Freitas
 */
public class Cartao {
	private long numeroDoCartao;
	private String nomeDoCartao;
	private Date validadeCartao;
	private int cvv;
	
	// Construtores
	public Cartao() {
		super();
	}
	
	public Cartao(long nudc, String nodc, Date vc, int cvv) { // Construtor Ebook
		this.numeroDoCartao = nudc;
		this.nomeDoCartao = nodc;
		this.validadeCartao = vc;
		this.cvv = cvv;
	}

	// Gets e Sets
	public long getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(long numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public String getNomeDoCartao() {
		return nomeDoCartao;
	}

	public void setNomeDoCartao(String nomeDoCartao) {
		this.nomeDoCartao = nomeDoCartao;
	}

	public Date getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(Date validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
}
