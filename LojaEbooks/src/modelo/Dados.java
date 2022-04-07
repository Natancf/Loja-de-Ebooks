package modelo;

import java.util.*;

public class Dados {
	private static Ebook[] ebooks = new Ebook[50];
	private static int qtdEbooks = 0;
	private static Leitor[] leitores = new Leitor[50];
	private static int qtdLeitores = 0;
	private static Editora[] editoras = new Editora[50];
	private static int qtdEditoras = 0;
	private static Pessoa[] pessoas = new Pessoa[50];
	private static int qtdPessoas = 0;
	private static Telefone[] telefones = new Telefone[50];
	private static int qtdTelefones = 0;
	private static Estante[] estante = new Estante[50];
	private static int qtdEstantes = 0;
	private static Cartao[] cartao = new Cartao[50];
	private static int qtdCartao = 0;
	
	public static void fillWithSomeData() {
		Date dat = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			telefones[i] = new Telefone((i+1)+61, (i+1)*1000000);
			cartao[i] = new Cartao((i+1)*123123412341234l, "nome"+i, dat, (i+1)*26);
			editoras[i] = new Editora("Editora"+i, "nome Editora"+i, "editora"+i+"@email.com", "senhaEditora"+i, (i+1)*1234123412341l, telefones[i], ebooks);
			ebooks[i] = new Ebook("Ebook"+i, "titulo"+i, "genero"+i, "autor"+i, "descricao"+i, dat, "portugues", (i+1)*40, "nome Editora"+i);
			leitores[i] = new Leitor("Leitor"+i, "Nome leitor"+i, "leitor"+i+"@email.com", "senhaLeitor"+i, telefones[i],estante[i],(i+1)*1234123412l, cartao[i]);
			estante[i] = new Estante(ebooks, "categoria"+i, "estante"+i, leitores[i].id);
			BancoDeDados.pessoas.add(editoras[i]);
			BancoDeDados.pessoas.add(leitores[i]);
			BancoDeDados.ebook.add(ebooks[i]);
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
	public void inserirEditarEditora(Editora e, int pos) {
		this.editoras[pos] = e;
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

	public void inserirEditarCartao(Cartao c, int pos) {
		this.cartao[pos] = c;
		if(pos == qtdCartao) qtdCartao++;
	}

	public void inserirEditarEstante(Estante es, int pos) {
		this.estante[pos] = es;
		if(pos == qtdEstantes) qtdEstantes++;		
	}
	
	
}
