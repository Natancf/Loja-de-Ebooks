package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Pedido;
import view.TelaDetalhePessoa;
import view.TelaPedido;
import view.TelaPessoa;

public class ControlePedido implements ActionListener{
	
	private TelaPedido telaPedido;

	public ControlePedido(TelaPedido telaPedido) {
		this.telaPedido = telaPedido;
	}

	public void realizarPedido(Pedido pedido) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
