package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.ControleCompra;
import controle.ControleLogin;

/**
 * Tela de Compra
 * 
 * @author Natanael Costa de Freitas
 * @see javax.swing.JFrame
 */
public class TelaComprar extends JFrame{
	private ControleCompra telaCompra;
	private JLabel titulo = new JLabel("Ebook's Store", JLabel.CENTER);
	private JLabel subTitulo = new JLabel("Sua loja de e-books", JLabel.CENTER);
	private JLabel mensagem = new JLabel("Cliente novo ? Clique para se cadastrar");
	private JLabel userLabel = new JLabel("Email:");
	private JLabel passwordLabel = new JLabel("Senha:");
	private JTextField userText = new JTextField(30);
	private JPasswordField passwordText = new JPasswordField(12);
	private JButton btnComprar = new JButton("Compra");
	
	public TelaComprar() {
		super("Comprar");
		this.telaCompra = new ControleCompra(this);
		
		// Estilo de texto
		titulo.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 40));
		titulo.setForeground(Color.WHITE);
		
		subTitulo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		subTitulo.setForeground(Color.WHITE);
		
		mensagem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mensagem.setForeground(Color.WHITE);
		
		// Estilo dos campos para login
		userLabel.setForeground(Color.WHITE);
		passwordLabel.setForeground(Color.WHITE);
		
		// Localizacao e tamanho dos componentes da tela
		titulo.setBounds(110, 20, 340, 50);
		subTitulo.setBounds(130, 70, 300, 30);
		mensagem.setBounds(160, 380, 300, 30);
		
		userLabel.setBounds(100, 150, 200, 75);
		userText.setBounds(160, 170, 280, 40);
		
		passwordLabel.setBounds(100, 220, 200, 75);
		passwordText.setBounds(160, 240, 280, 40);
		
		btnComprar.setBounds(240, 310, 80, 30);
		
		// Estilo dos botoes
		btnComprar.setBackground(new Color(199, 145, 230));
		btnComprar.setBorder(null);
		
		// Fonte dos botoes e labels
		Font fonte = new Font("Segoe UI", Font.PLAIN,  16);
		btnComprar.setFont(fonte);
		
		userLabel.setFont(fonte);
		passwordLabel.setFont(fonte);
		
		// Adicionando componentes a tela
		this.add(titulo);
		this.add(subTitulo);
		this.add(userLabel);
		this.add(userText);
		this.add(passwordLabel);
		this.add(passwordText);
		this.add(btnComprar);
		this.add(mensagem);
		
		// Cor do plano de fundo da tela
		getContentPane().setBackground(new Color(3, 192, 122));
		
		// Janela setting
		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		// Listeners
		userText.addActionListener(this.telaCompra);
		passwordText.addActionListener(this.telaCompra);
		btnComprar.addActionListener(this.telaCompra);
	}
	
	// Gets e Sets
	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(JLabel subTitulo) {
		this.subTitulo = subTitulo;
	}

	public JLabel getMensagem() {
		return mensagem;
	}

	public void setMensagem(JLabel mensagem) {
		this.mensagem = mensagem;
	}

	public JLabel getUserLabel() {
		return userLabel;
	}

	public void setUserLabel(JLabel userLabel) {
		this.userLabel = userLabel;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JLabel passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public JTextField getUserText() {
		return userText;
	}

	public void setUserText(JTextField userText) {
		this.userText = userText;
	}

	public JTextField getPasswordText() {
		return passwordText;
	}

	public void setPasswordText(JPasswordField passwordText) {
		this.passwordText = passwordText;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

	public ControleCompra getTelaCompra() {
		return telaCompra;
	}

	public void setTelaCompra(ControleCompra telaCompra) {
		this.telaCompra = telaCompra;
	}
}
