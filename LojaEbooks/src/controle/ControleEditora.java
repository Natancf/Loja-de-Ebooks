package controle;

import modelo.*;

public class ControleEditora {
	private Editora[] editora;
	private int qtdEditoras;
	
	public ControleEditora(ControleDados d) {
		editora = d.getEditoras();
		qtdEditoras = d.getQtdEditoras();
	}
	
	public String[] getNomeEditora() {
		String[] s = new String[qtdEditoras];
		for(int i = 0; i < qtdEditoras; i++) {
			s[i] = editora[i].getNome();
		}
		return s;
	}
	
	public int getQtd() {
		return qtdEditoras;
	}

	public void setQtd(int qtd) {
		this.qtdEditoras = qtd;
	}
	
	public String getNome(int i) {
		return editora[i].getNome();
	}
	
	public String getCNPJ(int i) {
		String numcnpj = String.valueOf(editora[i].getCnpj());
		return numcnpj;
	}
	
	public Ebook[] getEbooksEditora(int i) {
		return editora[i].getEbooksEditora();
	}
	
	public String getEmail(int i) {
		return editora[i].getEmail();
	}
	
	public String getId(int i) {
		String numId = String.valueOf(editora[i].getId());
		return numId;
	}
	
	public Telefone getTelefone(int i) {
		return editora[i].getNumeroTelefone();
	}
	
	public String getSenha(int i) {
		String senha = String.valueOf(editora[i].getSenha());
		return senha;
	}
	
	public void setQtdEditoras(int qtdEditoras) {
		this.qtdEditoras = qtdEditoras;
	}
}
