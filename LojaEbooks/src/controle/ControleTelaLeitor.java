package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.TelaLeitor;
import view.TelaLoja;

public class ControleTelaLeitor implements ActionListener {

	private final TelaLeitor telaLeitor;

	public static ControleDados dados = new ControleDados();
	
	public ControleTelaLeitor(TelaLeitor telaLeitor) {
		this.telaLeitor = telaLeitor;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		
		if(eventSource == telaLeitor.getBtnLivro()) {
			new TelaLoja().mostrarDados(dados, 1);
		}else if(eventSource == telaLeitor.getBtnPerfil()) {
			
		}else if(eventSource == telaLeitor.getBtnEstante()) {
			
		}
	}
}