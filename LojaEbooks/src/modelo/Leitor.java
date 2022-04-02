package modelo;

public class Leitor extends Pessoa{
	private Estante estante;
	private long cpf;
	
	public Leitor() {
		super();
	}
	
	public Leitor(String i, String n, String em, String s, Telefone t, Estante es, long cp) { // Construtor classe Leitor
		this.id = i;
		this.nome = n;
		this.email = em;
		this.senha = s;
		this.numeroTelefone = t;
		this.estante = es;
		this.cpf = cp;
	}
	
	@Override
	public String toString() {	
		return "Nome do aluno: " + nome;
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
