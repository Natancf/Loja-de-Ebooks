package view;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleDados;
import controle.ControleEbook;
import controle.ControleEstante;
import modelo.Ebook;

public class TelaEstante {
	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;
	private JList<String> listaEbooksCadastrados;
	private Ebook[] listaNomes = new Ebook[50];
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
	
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		janela = new JFrame(s);
		
		switch (op) {
		case 1:
			listaNomes = new ControleEstante(dados).getEbooksComprados(op);
			//listaEbooksCadastrados = new JList<String>(listaNomes );
			janela = new JFrame("Ebooks");
			titulo = new JLabel("Ebooks");
		
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaEbooksCadastrados.setBounds(20, 50, 350, 120);
			listaEbooksCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEbooksCadastrados.setVisibleRowCount(10);
		
			janela.setLayout(null);
		
			janela.add(titulo);
			janela.add(listaEbooksCadastrados);
		
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			//listaEbooksCadastrados.addListSelectionListener((ListSelectionListener) this);
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        // Cadastro de novo Leitor
        if (src == listaEbooksCadastrados)
        	new TelaPedido().comprar(3, dados, this, listaEbooksCadastrados.getSelectedIndex());
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaEbooksCadastrados) {
			new TelaPedido().comprar(3, dados, this, listaEbooksCadastrados.getSelectedIndex());
		}
	}
}
