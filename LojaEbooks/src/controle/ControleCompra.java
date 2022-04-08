package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.BancoDeDados;
import modelo.Dados;
import modelo.Ebook;
import modelo.Estante;
import modelo.Pessoa;
import view.TelaComprar;
import view.TelaEditora;
import view.TelaEstante;
import view.TelaLeitor;
import view.TelaLogin;
import view.TelaMenu;
import view.TelaPessoa;

/**
 * Classe que controla o processo de compra
 * 
 * @author Natanael Costa de Freitas
 */

public class ControleCompra implements ActionListener{
	private TelaComprar principal = new TelaComprar();
	
	public ControleCompra(TelaComprar telaComprar) {
		this.principal = principal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		
		if(eventSource == principal.getBtnComprar()) {
			if(compra(null) == true) {
				new TelaEstante();
			}JOptionPane.showMessageDialog(null, "Dados invalido! Tente novamente", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private boolean compra(String titulo) {
		Estante estante = new Estante();
		
		List<Ebook> estantess = new ArrayList<Ebook>();
		
		for(Ebook ebook : BancoDeDados.ebook){
			
			if(ebook.getTitulo().contains(titulo)) {
				estantess.add(ebook);
			}
			//estante.setEbooksComprados(estantess);
			
			if(BancoDeDados.ebooksComprados.add(estante)) 
				return true;
			else
				return false;
		}
		return false;
		
	}
	
}
