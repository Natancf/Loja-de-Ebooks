package controle;
import java.util.Date;

import modelo.*;

/**
 * Classe que controla as Estantes Cadastradas no Sistema
 * 
 * @author Natanael Costa de Freitas
 */
public class ControleEstante {
	private Estante[] estante;
	private Ebook[] ebook;
	private int qtdEstantes;
	
	// Construtor
	public ControleEstante(ControleDados d) {
		estante = d.getEstantes();
		qtdEstantes = d.getQtdEstantes();
	}
	
	// Gets e Sets
	public String[] getNomeEbook() {
		String[] s = new String[qtdEstantes];
		for(int i =0; i < qtdEstantes; i++) {
			s[i] = ebook[i].getTitulo();
		}
		
		return s;
	}
	
	public Ebook[] getEbooksComprados(int i) {
		return estante[i].getEbooksComprados();
	}

	public String getCategoria(int i) {
		return estante[i].getCategoria();
	}

	public String getEstanteId(int i) {
		return estante[i].getEstanteId();
	}

	public String getLeitorId(int i) {
		return estante[i].getLeitorId();
	}

}
