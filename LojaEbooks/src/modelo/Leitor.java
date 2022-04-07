package modelo;

public class Leitor extends Pessoa{
	private Estante estante;
	private long cpf;
	private Cartao cartao;
	
	public Leitor() {
		super();
	}
	
	public Leitor(String i, String n, String em, String s, Telefone t, Estante es, long CPF, Cartao ca) { // Construtor classe Leitor
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

	@Override
	public boolean isAdmin() {
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
