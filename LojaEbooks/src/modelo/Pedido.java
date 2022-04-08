package modelo;

/**
 * Classe modelo de pedido
 * 
 * @author Natanael Costa de Freitas
 */
public class Pedido {
	private Ebook precoEbook;
	private Cartao pagamento;
	private Leitor leitorId;
	
	// Construtores
	public Pedido() {
		super();
	}
	
	public Pedido(Ebook eb, Cartao p, Leitor lId) { // Construtor Ebook
		this.precoEbook = eb;
		this.pagamento = p;
		this.leitorId = lId;
	}

	// Gets e Sets
	public Ebook getPrecoEbook() {
		return precoEbook;
	}

	public void setPrecoEbook(Ebook precoEbook) {
		this.precoEbook = precoEbook;
	}

	public Cartao getPagamento() {
		return pagamento;
	}

	public void setPagamento(Cartao pagamento) {
		this.pagamento = pagamento;
	}

	public Leitor getLeitorId() {
		return leitorId;
	}

	public void setLeitorId(Leitor leitorId) {
		this.leitorId = leitorId;
	}
	
	
}
