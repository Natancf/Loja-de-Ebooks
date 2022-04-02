package modelo;

import java.util.*;

public class Dados {
	private Ebook[] ebooks = new Ebook[50];
	private int qtdEbooks = 0;
	private Leitor[] leitores = new Leitor[50];
	private int qtdLeitores = 0;
	private Editora[] editoras = new Editora[50];
	private int qtdEditoras = 0;
	private Telefone[] telefones = new Telefone[50];
	private int qtdTelefones = 0;
	private Estante[] estante = new Estante[50];
	private int qtdEstantes = 0;
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			telefones[i] = new Telefone((i+1)*100, (i+1)*1000000);
			editoras[i] = new Editora("Editora"+i, "nome Editora"+i, "editora"+i+"@email.com", "senhaEditora"+i, (i+1)*1234123412, telefones[i], ebooks[i]);
			ebooks[i] = new Ebook("Ebook"+i, "titulo"+i, "genero"+i, "autor"+i, "descricao"+i, d, "portugues", (i+1)*40, editoras[i]);
			estante[i] = new Estante(ebooks[i], "categoria"+i, "estante"+i, leitores[i]);
			leitores[i] = new Leitor("Leitor"+i, "Nome"+i, "leitor"+i+"@email.com", "senhaLeitor"+i, telefones[i],estante[i],(i+1)*1234123412);
		}
		qtdEbooks = 5;
		qtdLeitores = 5;
		qtdEditoras = 5;
		qtdTelefones = 5;
		qtdEstantes = 5;
	}
	
	public Ebook[] getEbooks() {
		return ebooks;
	}
	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}
	public int getQtdEbooks() {
		return qtdEbooks;
	}
	public void setQtdEbooks(int qtdEbooks) {
		this.qtdEbooks = qtdEbooks;
	}
	public Leitor[] getLeitores() {
		return leitores;
	}
	public void setLeitores(Leitor[] leitores) {
		this.leitores = leitores;
	}
	public int getQtdLeitores() {
		return qtdLeitores;
	}
	public void setQtdLeitores(int qtdLeitores) {
		this.qtdLeitores = qtdLeitores;
	}
	public Editora[] getEditoras() {
		return editoras;
	}
	public void setEditoras(Editora[] editoras) {
		this.editoras = editoras;
	}
	public int getQtdEditoras() {
		return qtdEditoras;
	}
	public void setQtdEditoras(int qtdEditoras) {
		this.qtdEditoras = qtdEditoras;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public int getQtdTelefones() {
		return qtdTelefones;
	}
	public void setQtdTelefones(int qtdTelefones) {
		this.qtdTelefones = qtdTelefones;
	}
	
	
}
