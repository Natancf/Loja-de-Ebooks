package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Curso");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton leitor = new JButton("Leitor");
	private static JButton ebook = new JButton("Ebook");
	private static JButton editora = new JButton("Editora");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		editora.setBounds(140, 150, 100, 30);
		leitor.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(leitor);
		janela.add(ebook);
		janela.add(editora);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		leitor.addActionListener(menu);
		editora.addActionListener(menu);
		ebook.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == leitor)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == editora)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == ebook)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matrícula", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
