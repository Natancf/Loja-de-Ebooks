package controle;


import java.util.Scanner;

import modelo.*;

/**
 * Classe que controla os Dados do Sistema
 * 
 * @author Natanael Costa de Freitas
 */
public class ControleDados {
	Scanner input = new Scanner(System.in);
	
	private Dados d = new Dados();
	
	/**
	 * chama o método fillWithSomeData
	 */
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	/**
	 * Gets
	 * @return Dados
	 */
	public Dados getDados() {
		return d;
	}
	/**
	 * Sets
	 * 
	 * @param d - Dados
	 */
	public void setDados(Dados d) {
		this.d = d;
	}
	/**
	 * Gets
	 * 
	 * @return Ebook[]
	 */
	public Ebook[] getEbooks() {
		return this.d.getEbooks();
	}
	/**
	 * Gets
	 * 
	 * @return int
	 */
	public int getQtdEbooks() {
		return this.d.getQtdEbooks();
	}
	/**
	 * Gets
	 * 
	 * @return Leitor[]
	 */
	public Leitor[] getLeitores() {
		return this.d.getLeitores();
	}
	/**
	 * Gets
	 * 
	 * @return int
	 */
	public int getQtdLeitores() {
		return this.d.getQtdLeitores();
	}
	/**
	 * Gets
	 * 
	 * @return Editora[]
	 */
	public Editora[] getEditoras() {
		return this.d.getEditoras();
	}
	/**
	 * Gets
	 * 
	 * @return int
	 */
	public int getQtdEditoras() {
		return this.d.getQtdEbooks();
	}
	/**
	 * Gets
	 * 
	 * @return Telefone[]
	 */
	public Telefone[] getTelefones() {
		return this.d.getTelefones();
	}
	/**
	 * Gets
	 * 
	 * @return int
	 */
	public int getQtdTelefones() {
		return this.d.getQtdTelefones();
	}
	/**
	 * Gets
	 * 
	 * @return Estante[]
	 */
	public Estante[] getEstantes() {
		return this.d.getEstante();
	}
	/**
	 * Gets
	 * 
	 * @return int
	 */
	public int getQtdEstantes() {
		return this.d.getQtdEstantes();
	}
	
	/**
	 * Insere ou Edita Dados de Ebook
	 * 
	 * @param dadosEbook - String[]
	 * @return boolean
	 */
	public boolean inserirEditarEbook(String[] dadosEbook) {
		if(!dadosEbook[3].matches("[0-9]+") || !dadosEbook[4].matches("[0-9]+") || 
				!dadosEbook[5].matches("[0-9]+") || !dadosEbook[6].matches("[0-9]+")) {
			return false;
		} else {
				Ebook e = new Ebook(dadosEbook[1], dadosEbook[2], dadosEbook[3], dadosEbook[4], dadosEbook[5], null, dadosEbook[7], Double.parseDouble(dadosEbook[8]),dadosEbook[9]);
				d.inserirEditarEbook(e, Integer.parseInt(dadosEbook[0]));
				return true;
		}
	}

	/**
	 * Insere ou Edita Dados de Leitor
	 * 
	 * @param dadosLeitor - String[]
	 * @return boolean
	 */
	public boolean inserirEditarLeitor(String[] dadosLeitor) {
	    if(!dadosLeitor[4].matches("[0-9]+") || !dadosLeitor[6].matches("[0-9]+") || 
	            !dadosLeitor[7].matches("[0-9]+")) {
	        return false;
	    } else {
	            Leitor l = new Leitor(dadosLeitor[1], dadosLeitor[2], dadosLeitor[3], Long.parseLong(dadosLeitor[4]), dadosLeitor[5], 
	            		new Telefone(Integer.parseInt(dadosLeitor[6]),Integer.parseInt(dadosLeitor[7])));
	            d.inserirEditarLeitor(l, Integer.parseInt(dadosLeitor[0]));
	            return true;
	    }
	}
	
	/**
	 * Insere ou Edita Dados de Editora
	 * 
	 * @param dadosEditora - String[]
	 * @return boolean
	 */
	public boolean inserirEditarEditora(String[] dadosEditora) {
	    if(!dadosEditora[4].matches("[0-9]+") || !dadosEditora[6].matches("[0-9]+") || 
	            !dadosEditora[7].matches("[0-9]+")) {
	        return false;
	    } else {
				Editora e = new Editora(dadosEditora[1], dadosEditora[2], dadosEditora[3], Long.parseLong(dadosEditora[4]), dadosEditora[5], 
						new Telefone(Integer.parseInt(dadosEditora[6]),Integer.parseInt(dadosEditora[7])));
	            d.inserirEditarEditora(e, Integer.parseInt(dadosEditora[0]));
	            return true;
	    }
	}
	
	/**
	 * Insere ou Edita Dados de Estante
	 * 
	 * @param dadosEstante - String[]
	 * @return boolean
	 */
	public boolean inserirEditarEstante(String[] dadosEstante) {
		if(!dadosEstante[4].matches("[0-9]+") || !dadosEstante[6].matches("[0-9]+") || 
				!dadosEstante[7].matches("[0-9]+")) {
			return false;
		} else {
				Estante es = new Estante(null, dadosEstante[2], dadosEstante[3], dadosEstante[4]);
		
				d.inserirEditarEstante(es, Integer.parseInt(dadosEstante[0]));
				return true;
		}
	}
	
	/**
	 * Insere ou Edita Dados de Cartao
	 * 
	 * @param dadosCartao - String[]
	 * @return boolean
	 */
	public boolean inserirEditarCartao(String[] dadosCartao) {
		if(!dadosCartao[1].matches("[0-9]+") || !dadosCartao[2].matches("[0-9]+") || 
				!dadosCartao[3].matches("[0-9]+")) {
			return false;
		} else {
				Cartao c = new Cartao(Long.parseLong(dadosCartao[1]), dadosCartao[2], null, Integer.parseInt(dadosCartao[3]));
				d.inserirEditarCartao(c, Integer.parseInt(dadosCartao[0]));
				return true;
		}
	}
	
	/**
	 *  Remove Dados de Ebook
	 * 
	 * @param i - int
	 * @return boolean
	 */
	public boolean removerEbook(int i) {
		String ebookRemovido = d.getEbooks()[i].getTitulo();
		
		if(i == (d.getQtdEbooks() - 1)) { // O Ebook a ser removido está no final do array
			d.setQtdEbooks(d.getQtdEbooks() - 1);
			d.getEbooks()[d.getQtdEbooks()] = null;
			return true;
		} else { // o Ebook a ser removido está no meio do array
			int cont = 0;
			while(d.getEbooks()[cont].getTitulo().compareTo(ebookRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdEbooks() - 1; j++) {
				d.getEbooks()[j] = null;
				d.getEbooks()[j] = d.getEbooks()[j+1];
			}
			d.getEbooks()[d.getQtdEbooks()] = null;
			d.setQtdEbooks(d.getQtdEbooks() - 1);
			return true;
		}
	}
	
	/**
	 *  Remove Dados de Leitor
	 * 
	 * @param i - int
	 * @return boolean
	 */
	public boolean removerLeitor(int i) {
		String leitorRemovido = d.getLeitores()[i].getNome();
		
		if(i == (d.getQtdLeitores() - 1)) { // O Leitor a ser removido está no final do array
			d.setQtdLeitores(d.getQtdLeitores() - 1);
			d.getLeitores()[d.getQtdLeitores()] = null;
			return true;
		} else { // o Leitor a ser removido está no meio do array
			int cont = 0;
			while(d.getLeitores()[cont].getNome().compareTo(leitorRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdLeitores() - 1; j++) {
				d.getLeitores()[j] = null;
				d.getLeitores()[j] = d.getLeitores()[j+1];
			}
			d.getLeitores()[d.getQtdLeitores()] = null;
			d.setQtdLeitores(d.getQtdLeitores() - 1);
			return true;
		}
	}
	
	/**
	 *  Remove Dados de Editora
	 * 
	 * @param i - int
	 * @return boolean
	 */
	public boolean removerEditora(int i) {
	    String editoraRemovido = d.getEditoras()[i].getNome();
	    
	    if(i == (d.getQtdEditoras() - 1)) { // O Editora a ser removido está no final do array
	        d.setQtdEditoras(d.getQtdEditoras() - 1);
	        d.getEditoras()[d.getQtdEditoras()] = null;
	        return true;
	    } else { // o Editora a ser removido está no meio do array
	        int cont = 0;
	        while(d.getEditoras()[cont].getNome().compareTo(editoraRemovido) != 0) {
	            cont++;
	        }
	        //Rotina swap
	        for(int j = cont; j < d.getQtdEditoras() - 1; j++) {
	            d.getEditoras()[j] = null;
	            d.getEditoras()[j] = d.getEditoras()[j+1];
	        }
	        d.getEditoras()[d.getQtdEditoras()] = null;
	        d.setQtdEditoras(d.getQtdEditoras() - 1);
	        return true;
	    }
	}
	
	/**
	 *  Pesquisa Ebook por nome do autor
	 * 
	 * @param autor - String
	 * @return boolean
	 */
	public String buscarPorAutor(String autor) {
		// Percorre a lista verficando se existe algum livro do autor inserido
		for(Ebook ebook : d.getEbooks()) {
			// Metodo contains verifica o nome de algum autor contem a String inserida
			if(ebook.getNomeAutor().contains(autor)) 
				return ebook.getNomeAutor();
		}
		return null;
	}
	
	/**
	 *  Pesquisa Ebook por genero
	 * 
	 * @param genero - String
	 * @return String
	 */
	public String buscarPorGenero(String genero) {
		// Percorre a lista e imprime os livros do mesmo genero
		for(Ebook ebook : d.getEbooks()) {
			if(ebook.getGenero().contains(genero))
				return ebook.getGenero();
		}
		return null;
	}
	
	/**
	 *  Pesquisa Ebook por titulo
	 * 
	 * @param titulo - String
	 * @return String
	 */
	public String buscarPorTitulo(String titulo) {
		// Percorre a lista e imprime os livros do mesmo genero
		for(Ebook ebook : d.getEbooks()) {
			if(ebook.getTitulo().contains(titulo))
				return ebook.getTitulo();
		}
		return null;
	}

		
}
