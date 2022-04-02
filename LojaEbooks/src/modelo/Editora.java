package modelo;

public class Editora extends Pessoa{
	private long cnpj;
	private Ebook ebooksEditora;
	
	public Editora(String i, String n, String e, String s, long c, Telefone t, Ebook ee) { //Construtor classe Editora
		this.id = i;
		this.nome = n;
		this.email = e;
		this.senha = s;
		this.cnpj = c;
		this.numeroTelefone = t;
		this.ebooksEditora = ee; 
	}

	// Gets e Sets
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public Ebook getEbooksEditora() {
		return ebooksEditora;
	}

	public void setEbooksEditora(Ebook ebooksEditora) {
		this.ebooksEditora = ebooksEditora;
	}
	

}
