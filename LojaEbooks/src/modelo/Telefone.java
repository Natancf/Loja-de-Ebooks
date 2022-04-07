package modelo;

public class Telefone {
	
	private int DDD;
	private int numero;
	

	public Telefone(int cod, int num) { // Construtor Telefone
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