package controle;

import modelo.*;


/**
 * Classe que controla os Leitores Cadastrados no Sistema
 * 
 * @author Natanael Costa de Freitas
 */
public class ControleLeitor {
	private Leitor[] leitor;
	private int qtdLeitores;
	
	private ControleDados d;
	
	// Construtor
	public ControleLeitor(ControleDados d) {
		leitor = d.getLeitores();
		qtdLeitores = d.getQtdLeitores();
	}
	
	/**
	 *  Cadastra leitores
	 * 
	 * @param nome - String
	 * @param email - String
	 * @param senha - String
	 * @param telefone - Telefone
	 */
	public static boolean cadastrar(String nome, String email, String senha, Telefone telefone) {
		
		Leitor leitor = new Leitor();
		leitor.setNome(nome);
		leitor.setEmail(email);
		leitor.setSenha(senha);
		leitor.getNumeroTelefone();
		
		if(BancoDeDados.pessoas.add(leitor)) {
			BancoDeDados.qtdPessoas++;
			return true;
		}
		else 
			return false;
	}
	
	// Gets e Sets
	public String[] getNomeLeitor() {
		String[] s = new String[qtdLeitores];
		for(int i = 0; i < qtdLeitores; i++) {
			s[i] = leitor[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdLeitores;
	}
	
	public void setQtd(int qtd) {
		this.qtdLeitores = qtd;
	}
	
	public String getNome(int i) {
		return leitor[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(leitor[i].getCpf());
		return numCPF;
	}
	
	public String getEmail(int i) {
		return leitor[i].getEmail();
	}
	
	public Estante getEstante(int i) {
		return leitor[i].getEstante();
	}
	
	public String getID(int i) {
		String numID = String.valueOf(leitor[i].getId());
		return numID;
	}
	
	public Telefone getTelefone(int i) {
		return leitor[i].getNumeroTelefone();
	}
	
	public String getSenha(int i) {
		String senha = String.valueOf(leitor[i].getSenha());
		return senha;
	}
	
	public void setQtdLeitores(int qtdLeitores) {
		this.qtdLeitores = qtdLeitores;
	}
}
