package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.*;

/**
 * Tela para o Cadastro de Pessoas
 * 
 * @author Natanael Costa de Freitas
 * @see javax.swing.JFrame
 */
public class TelaCadastroLeitor extends JFrame {

	private JLabel titulo = new JLabel("Cadastro", JLabel.CENTER);
	private JLabel mensagem = new JLabel("Preencha com seus dados", JLabel.CENTER);
	private JLabel nomeLabel = new JLabel("Nome:");
	private JLabel dataNascLabel = new JLabel("Data de nascimento:");
	private JLabel cpfLabel = new JLabel("CPF:");
	private JLabel telefoneLabel = new JLabel("Telefone:");
	private JLabel mensagem2 = new JLabel("Dados para login", JLabel.CENTER);
	private JLabel emailLabel = new JLabel("Email:");
	private JLabel senhaLabel = new JLabel("Senha:");
	private JTextField nomeText = new JTextField(30);
	private JTextField dataNascText = new JTextField(10);
	private JTextField cpfText = new JTextField(11);
	private JTextField telefoneText = new JTextField(15);
	private JTextField emailText = new JTextField(30);
	private JPasswordField senhaText = new JPasswordField(12);
	private JButton btnEnviar = new JButton("Enviar");
	private ControleCadastroPessoa controleCadastroPessoa;
	
	/**
	 * Adiciona as opções da tela de cadastro de pessoas
	 */
	public TelaCadastroLeitor() {
		super("Cadastro"); // JFrame com nome

		// Menu textos
		titulo.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 40));
		titulo.setForeground(Color.WHITE);
		
		mensagem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mensagem.setForeground(Color.WHITE);
		
		mensagem2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mensagem2.setForeground(Color.WHITE);
		
		Font font = new Font("Segoe UI", Font.PLAIN, 16);
		nomeLabel.setFont(font);
		nomeLabel.setForeground(Color.WHITE);
		
		dataNascLabel.setFont(font);
		dataNascLabel.setForeground(Color.WHITE);
		
		cpfLabel.setFont(font);
		cpfLabel.setForeground(Color.WHITE);
		
		telefoneLabel.setFont(font);
		telefoneLabel.setForeground(Color.WHITE);
		
		emailLabel.setFont(font);
		emailLabel.setForeground(Color.WHITE);
		
		senhaLabel.setFont(font);
		senhaLabel.setForeground(Color.WHITE);
		
		// Posicao e tamanho dos componentes da tela
		titulo.setBounds(110, 20, 340, 50);
		mensagem.setBounds(130, 70, 300, 30);
		
		nomeLabel.setBounds(50, 110, 200, 75);
		nomeText.setBounds(130, 130, 350, 30);
		
		dataNascLabel.setBounds(50, 160, 200, 75);
		dataNascText.setBounds(220, 180, 260, 30);
		
		cpfLabel.setBounds(50, 210, 200, 75);
		cpfText.setBounds(100, 230, 120, 30);
		
		telefoneLabel.setBounds(280, 210, 200, 75);
		telefoneText.setBounds(360, 230, 120, 30);
		
		mensagem2.setBounds(130, 280, 300, 30);
		
		emailLabel.setBounds(50, 320, 300, 30);
		emailText.setBounds(130, 320, 350, 30);
		
		senhaLabel.setBounds(50, 370, 300, 30);
		senhaText.setBounds(130, 370, 350, 30);
				
		btnEnviar.setBounds(225, 420, 100, 30);
		
		// Estilo do botao
		btnEnviar.setBackground(new Color(199, 145, 230));
		btnEnviar.setBorder(null);
		
		btnEnviar.setFont(new Font("Segoe UI", Font.PLAIN,  16));
		
		// Adicionando componentes a tela
		this.add(titulo);
		this.add(mensagem);
		this.add(nomeLabel);
		this.add(nomeText);
		this.add(dataNascLabel);
		this.add(dataNascText);
		this.add(cpfLabel);
		this.add(cpfText);
		this.add(telefoneLabel);
		this.add(telefoneText);
		this.add(mensagem2);
		this.add(emailLabel);
		this.add(emailText);
		this.add(senhaLabel);
		this.add(senhaText);
		this.add(btnEnviar);
		
		// Cor do plano de fundo da tela
		getContentPane().setBackground(new Color(32, 32, 32));
				
		// Janela settings
		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		
		// Listers
		nomeText.addActionListener(this.controleCadastroPessoa);
		dataNascText.addActionListener(this.controleCadastroPessoa);
		cpfText.addActionListener(this.controleCadastroPessoa);
		telefoneText.addActionListener(this.controleCadastroPessoa);
		emailText.addActionListener(this.controleCadastroPessoa);
		senhaText.addActionListener(this.controleCadastroPessoa);
		btnEnviar.addActionListener(this.controleCadastroPessoa);
	}

	// Gets e Sets
	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getMensagem() {
		return mensagem;
	}

	public void setMensagem(JLabel mensagem) {
		this.mensagem = mensagem;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public void setNomeLabel(JLabel nomeLabel) {
		this.nomeLabel = nomeLabel;
	}

	public JLabel getDataNascimentoLabel() {
		return dataNascLabel;
	}

	public void setDataNascimentoLabel(JLabel dataNascimentoLabel) {
		this.dataNascLabel = dataNascimentoLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public void setCpfLabel(JLabel cpfLabel) {
		this.cpfLabel = cpfLabel;
	}

	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}

	public void setTelefoneLabel(JLabel telefoneLabel) {
		this.telefoneLabel = telefoneLabel;
	}

	public JLabel getMensagem2() {
		return mensagem2;
	}

	public void setMensagem2(JLabel mensagem2) {
		this.mensagem2 = mensagem2;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(JLabel emailLabel) {
		this.emailLabel = emailLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public void setSenhaLabel(JLabel senhaLabel) {
		this.senhaLabel = senhaLabel;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public JTextField getNomeText() {
		return nomeText;
	}

	public void setNomeText(JTextField nomeText) {
		this.nomeText = nomeText;
	}

	public JTextField getDataNascimentoText() {
		return dataNascText;
	}

	public void setDataNascimentoText(JTextField dataNascimentoText) {
		this.dataNascText = dataNascimentoText;
	}

	public JTextField getCpfText() {
		return cpfText;
	}

	public void setCpfText(JTextField cpfText) {
		this.cpfText = cpfText;
	}

	public JTextField getTelefoneText() {
		return telefoneText;
	}

	public void setTelefoneText(JTextField telefoneText) {
		this.telefoneText = telefoneText;
	}

	public JTextField getEmailText() {
		return emailText;
	}

	public void setEmailText(JTextField emailText) {
		this.emailText = emailText;
	}

	public JPasswordField getSenhaText() {
		return senhaText;
	}

	public void setSenhaText(JPasswordField senhaText) {
		this.senhaText = senhaText;
	}
}