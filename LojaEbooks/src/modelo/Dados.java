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
	private Cartao[] cartao = new Cartao[50];
	private int qtdCartao = 0;
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			telefones[i] = new Telefone((i+1)+61, (i+1)*1000000);
			cartao[i] = new Cartao((i+1)*123123412341234l, "nome"+i, d, (i+1)*26);
			editoras[i] = new Editora("Editora"+i, "nome Editora"+i, "editora"+i+"@email.com", "senhaEditora"+i, (i+1)*1234123412341l, telefones[i], ebooks);
			ebooks[i] = new Ebook("Ebook"+i, "titulo"+i, "genero"+i, "autor"+i, "descricao"+i, d, "portugues", (i+1)*40, "nome Editora"+i);
			estante[i] = new Estante(ebooks, "categoria"+i, "estante"+i, leitores[i].id);
			leitores[i] = new Leitor("Leitor"+i, "Nome"+i, "leitor"+i+"@email.com", "senhaLeitor"+i, telefones[i],estante[i],(i+1)*1234123412l, cartao[i]);
		}
		qtdEbooks = 5;
		qtdLeitores = 5;
		qtdEditoras = 5;
		qtdTelefones = 5;
		qtdEstantes = 5;
		qtdCartao = 5;
	}
	
	public Ebook[] getEbooks() {
		return ebooks;
	}
	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}
	public void inserirEditarEbook(Ebook e, int pos) {
		this.ebooks[pos] = e;
		if(pos == qtdEbooks) qtdEbooks++;
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
	public void inserirEditarLeitor(Leitor l, int pos) {
		this.leitores[pos] = l;
		if(pos == qtdLeitores) qtdLeitores++;
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
	public void inserirEditarEditora(Editora ed, int pos) {
		this.editoras[pos] = ed;
		if(pos == qtdEditoras) qtdEditoras++;
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

	public Estante[] getEstante() {
		return estante;
	}

	public void setEstante(Estante[] estante) {
		this.estante = estante;
	}

	public int getQtdEstantes() {
		return qtdEstantes;
	}

	public void setQtdEstantes(int qtdEstantes) {
		this.qtdEstantes = qtdEstantes;
	}

	public Cartao[] getCartao() {
		return cartao;
	}

	public void setCartao(Cartao[] cartao) {
		this.cartao = cartao;
	}

	public int getQtdCartao() {
		return qtdCartao;
	}

	public void setQtdCartao(int qtdCartao) {
		this.qtdCartao = qtdCartao;
	}
	
	
}
