package modelo;

/**
 * Classe modelo de editora
 * 
 * @author Natanael Costa de Freitas
 */
public class Editora extends Pessoa{
	private long cnpj;
	private Ebook[] ebooksEditora;
	
	// Construtor
	public Editora() {
		super();
	}
	
	public Editora(String i, String n, String e, String s, long c, Telefone t, Ebook[] e2) { //Construtor classe Editora
		this.id = i;
		this.nome = n;
		this.email = e;
		this.senha = s;
		cnpj = c;
		this.numeroTelefone = t;
		ebooksEditora = e2; 
	}

	public Editora(String n, String e, String s, long c, String i, Telefone t) {
		this.nome = n;
		this.email = e;
		this.senha = s;
		cnpj = c;
		this.id = i;
		this.numeroTelefone = t;
		
	}

	// Gets e Sets
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public Ebook[] getEbooksEditora() {
		return ebooksEditora;
	}

	public void setEbooksEditora(Ebook[] ebooksEditora) {
		this.ebooksEditora = ebooksEditora;
	}
	
	/**
	 * Atribui true ao método EhEditora
	 * 
	 * @return true
	 */
	@Override
	public boolean EhEditora() {
		return true; 
	}

}
