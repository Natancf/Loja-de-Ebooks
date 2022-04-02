package modelo;

import java.util.Date;

public class Cartao {
	private double numeroDoCartao;
	private String nomeDoCartao;
	private Date validadeCartao;
	private int cvv;
	
	public Cartao() {
		super();
	}
	
	public Cartao(double nudc, String nodc, Date vc, int cvv) { // Construtor Ebook
		this.numeroDoCartao = nudc;
		this.nomeDoCartao = nodc;
		this.validadeCartao = vc;
		this.cvv = cvv;
	}

	// Gets e Sets
	public double getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(double numeroDoCartao) {
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
