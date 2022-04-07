package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.ControleLogin;

public class TelaLogin extends JFrame {
	
	private JLabel titulo = new JLabel("Esquilo", JLabel.CENTER);
	private JLabel subTitulo = new JLabel("Monte sua biblioteca", JLabel.CENTER);
	private JLabel mensagem = new JLabel("Ainda Não Possui Uma Conta?");
	private JLabel userLabel = new JLabel("Email:");
	private JLabel passwordLabel = new JLabel("Senha:");
	private JTextField userText = new JTextField(30);
	private JPasswordField passwordText = new JPasswordField(12);
	private JButton btnLogin = new JButton("Entrar");
	private JButton btnCadastrar = new JButton("Quero Me Cadastrar");
	private ControleLogin telaPrincipalController;
	
	public TelaLogin() {
		super("Ebook's Store"); // JFrame com nome
		this.telaPrincipalController = new ControleLogin(this);
		
		// texto
		titulo.setFont(new Font("Roboto", Font.BOLD, 40));
		titulo.setForeground(Color.WHITE);
		subTitulo.setFont(new Font("Roboto", Font.PLAIN, 15));
		subTitulo.setForeground(Color.WHITE);
		mensagem.setFont(new Font("Roboto", Font.PLAIN, 14));
		mensagem.setForeground(Color.WHITE);
		titulo.setBounds(110, 20, 340, 50);
		subTitulo.setBounds(130, 70, 300, 30);
		mensagem.setBounds(165, 620, 300, 30);
		
		// Labels settings
		userLabel.setBounds(30, 110, 180, 75);
		userText.setBounds(75, 138, 160, 20);
		passwordLabel.setBounds(280, 110, 180, 75);
		passwordText.setBounds(330, 138, 160, 20);
		userLabel.setForeground(Color.WHITE);
		passwordLabel.setForeground(Color.WHITE);
		Font fonteLabels = new Font("Roboto", Font.BOLD,  15);
		userLabel.setFont(fonteLabels);
		passwordLabel.setFont(fonteLabels);
		
		// botoes settings
		btnLogin.setBounds(115, 170, 300, 30);
		btnCadastrar.setBounds(115, 650, 300, 30);
		btnLogin.setBackground(new Color(0, 130, 93));
		btnLogin.setForeground(Color.WHITE);
		btnCadastrar.setBackground(new Color(0, 130, 93));
		btnCadastrar.setForeground(Color.WHITE);
		Font fonte = new Font("Roboto", Font.BOLD,  16);
		btnLogin.setFont(fonte);
		btnCadastrar.setFont(fonte);
		
		// Adicionando componentes a tela
		this.add(titulo);
		this.add(subTitulo);
		this.add(userLabel);
		this.add(userText);
		this.add(passwordLabel);
		this.add(passwordText);
		this.add(btnLogin);
		this.add(mensagem);
		this.add(btnCadastrar);
		
		// Cor do plano de fundo da tela
		getContentPane().setBackground(new Color(3, 192, 122));
		
		// Estilo da janela
		this.setSize(560, 800);
		this.setLayout(null);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		// Adicionando o ActionListener
		userText.addActionListener(this.telaPrincipalController);
		passwordText.addActionListener(this.telaPrincipalController);
		btnLogin.addActionListener(this.telaPrincipalController);
		
		btnCadastrar.addActionListener(this.telaPrincipalController);
	}
	
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

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public ControleLogin getTelaPrincipalController() {
		return telaPrincipalController;
	}

	public void setTelaPrincipalController(ControleLogin telaPrincipalController) {
		this.telaPrincipalController = telaPrincipalController;
	}
}