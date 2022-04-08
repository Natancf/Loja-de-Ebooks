package modelo;

/**
 * Classe modelo de leitor
 * 
 * @author Natanael Costa de Freitas
 */
public class Leitor extends Pessoa{
	private Estante estante;
	private long cpf;
	private Cartao cartao;
	
	// Construtores
	public Leitor() {
		super();
	}
	
	public Leitor(String i, String n, String em, String s, Telefone t, Estante es, long CPF, Cartao ca) {
		this.id = i;
		this.nome = n;
		this.email = em;
		this.senha = s;
		this.numeroTelefone = t;
		estante = es;
		cpf = CPF;
		cartao = ca;
	}
	
	public Leitor(String n, String em, String s, long CPF, String i,Telefone t) {
		this.nome = n;
		this.email = em;
		this.senha = s;
		cpf = CPF;
		this.id = i;
		this.numeroTelefone = t;
		
	}
	/**
	 * atribui false ao método EhEditora
	 * 
	 * @return false
	 */
	@Override
	public boolean EhEditora() {
		return false; 
	}
	@Override
	public String toString() {	
		return "Nome do Leitor: " + nome;
	}


	// Gets e Sets
	public Estante getEstante() {
		return estante;
	}
	public void setEstante(Estante estante) {
		this.estante = estante;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
}
