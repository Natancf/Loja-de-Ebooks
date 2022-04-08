package modelo;

/**
 * Classe modelo de telefone
 * 
 * @author Natanael Costa de Freitas
 */
public class Telefone {
	
	private int DDD;
	private int numero;
	
	// Construtores
	public Telefone(int cod, int num) { 
		DDD = cod;
		numero = num;
	}


	@Override
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}

	// Gets e Sets
	public int getDDD() {
		return DDD;
	}


	public void setDDD(int dDD) {
		DDD = dDD;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}