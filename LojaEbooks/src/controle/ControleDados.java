package controle;


import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Ebook[] getEbooks() {
		return this.d.getEbooks();
	}
	public int getQtdEbooks() {
		return this.d.getQtdEbooks();
	}
	public Leitor[] getLeitores() {
		return this.d.getLeitores();
	}
	public int getQtdLeitores() {
		return this.d.getQtdLeitores();
	}
	public Editora[] getEditoras() {
		return this.d.getEditoras();
	}
	public int getQtdEditoras() {
		return this.d.getQtdEbooks();
	}
	public Telefone[] getTelefones() {
		return this.d.getTelefones();
	}
	public int getQtdTelefones() {
		return this.d.getQtdTelefones();
	}
	
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

	public boolean inserirEditarLeitor(String[] dadosLeitor) {
	    if(!dadosLeitor[3].matches("[0-9]+") || !dadosLeitor[4].matches("[0-9]+") || 
	            !dadosLeitor[5].matches("[0-9]+") || !dadosLeitor[6].matches("[0-9]+")) {
	        return false;
	    } else {
	    		Ebook[] e = this.getEbooks();
	            Leitor l = new Leitor(dadosLeitor[1], dadosLeitor[2], dadosLeitor[3], dadosLeitor[4], new Telefone(Integer.parseInt(dadosLeitor[5]),
	                    Integer.parseInt(dadosLeitor[6])), new Estante(e,dadosLeitor[7], dadosLeitor[8], dadosLeitor[9]), Long.parseLong(dadosLeitor[10]), 
	            		new Cartao(Long.parseLong(dadosLeitor[11]), dadosLeitor[12], null, Integer.parseInt(dadosLeitor[13])));
	            d.inserirEditarLeitor(l, Integer.parseInt(dadosLeitor[0]));
	            return true;
	    }
	}

	public boolean inserirEditarEditora(String[] dadosEditora) {
	    if(!dadosEditora[3].matches("[0-9]+") || !dadosEditora[4].matches("[0-9]+") || 
	            !dadosEditora[5].matches("[0-9]+") || !dadosEditora[6].matches("[0-9]+")) {
	        return false;
	    } else {
	    		Ebook[] e = this.getEbooks();
				Editora l = new Editora(dadosEditora[1], dadosEditora[2], dadosEditora[3], dadosEditora[4], Long.parseLong(dadosEditora[5]), new Telefone(Integer.parseInt(dadosEditora[6]),
	                    Integer.parseInt(dadosEditora[7])), e);
	            d.inserirEditarEditora(l, Integer.parseInt(dadosEditora[0]));
	            return true;
	    }
	}
	
}
