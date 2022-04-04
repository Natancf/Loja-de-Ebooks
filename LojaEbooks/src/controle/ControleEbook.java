package controle;
import java.util.Date;

import modelo.*;

public class ControleEbook {
	private Ebook[] ebook;
	private int qtdEbooks;
	
	public ControleEbook(ControleDados d) {
		ebook = d.getEbooks();
		qtdEbooks = d.getQtdEbooks();
	}
	
	public String[] getNomeEbook() {
		String[] s = new String[qtdEbooks];
		for(int i =0; i < qtdEbooks; i++) {
			s[i] = ebook[i].getTitulo();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdEbooks;
	}
	
	public void setQtd(int qtd) {
		this.qtdEbooks = qtd;
	}
	
	public String getNome(int i) {
		return ebook[i].getTitulo();
	}
	
	public String getDescricao(int i) {
		return ebook[i].getDescricao();
	}
	
	public String getID(int i) {
		String numID = String.valueOf(ebook[i].getIdEbook());
		return numID;
	}
	
	public String getGenero(int i) {
		return ebook[i].getGenero();
	}
	
	public String getNomeAutor(int i) {
		return ebook[i].getNomeAutor();
	}
	
	public String getIdioma(int i) {
		return ebook[i].getIdioma();
	}
	
	public double getPreco(int i) {;
		return ebook[i].getPreco();
	}
	
	public String getEditora(int i) {
		return ebook[i].getEditora();
	}
	
	public Date getAnoDePublicacao(int i) {
		return ebook[i].getAnoDePublicacao();
	}	
	
	public void setQtdEbooks(int qtdEbooks) {
		this.qtdEbooks = qtdEbooks;
	}
}
