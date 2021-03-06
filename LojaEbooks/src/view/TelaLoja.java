package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Tela da loja
 * 
 * @author Natanael Costa de Freitas
 * @see javax.swing.JFrame
 */
public class TelaLoja implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;
	private JList<String> listaEbooksCadastrados;
	private String[] listaNomes = new String[50];
	private String[] novoDado = new String[50];
	private JButton comprar;
	private int posicao;
	private int opcao;
	private String s;
	private JLabel tituloEbook;
	private JLabel autorEbook;
	private JLabel generoEbook;
	private JLabel descricaoEbook;
	private JLabel precoEbook;
	private JLabel idiomaEbook;
	private JLabel editoraEbook;
	
	/**
	 * Exibe todos os ebooks cadastrados no sistema
	 */
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		janela = new JFrame(s);
		
		switch (op) {
		case 1:
			listaNomes = new ControleEbook(dados).getNomeEbook();
			listaEbooksCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Ebooks");
			titulo = new JLabel("Ebooks");
		
			titulo.setFont(new Font("Roboto", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaEbooksCadastrados.setBounds(20, 50, 350, 120);
			listaEbooksCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEbooksCadastrados.setVisibleRowCount(10);
		
			janela.setLayout(null);
		
			janela.add(titulo);
			janela.add(listaEbooksCadastrados);
		
			janela.setSize(600, 800);
			janela.setVisible(true);
			
			listaEbooksCadastrados.addListSelectionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object src = e.getSource();
//        // Cadastro de novo Leitor
//        if (src == listaEbooksCadastrados)
//        	new TelaPedido().comprar(3, dados, this, listaEbooksCadastrados.getSelectedIndex());
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
//		Object src = e.getSource();
//
//		if(e.getValueIsAdjusting() && src == listaEbooksCadastrados) {
//			new TelaPedido().comprar(3, dados, this, listaEbooksCadastrados.getSelectedIndex());
//		}
	}
}
