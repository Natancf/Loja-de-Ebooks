package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaEditora;
import view.TelaEditora;

public class ControleTelaEditora implements ActionListener{
	
	private final TelaEditora telaEditora;
	
	public ControleTelaEditora(TelaEditora telaEditora) {
		this.telaEditora = telaEditora;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		
		if(eventSource == telaEditora.getBtnEbook()) {
			// new TelaMenuLivro;
		}
	}
}
