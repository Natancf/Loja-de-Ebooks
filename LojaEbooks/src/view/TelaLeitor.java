package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleTelaLeitor;

public class TelaLeitor extends JFrame {

	private JLabel titulo = new JLabel("Menu", JLabel.CENTER);
	private JLabel mensagem = new JLabel("Clique para acessar", JLabel.CENTER);
	private JButton btnLivro = new JButton("Livros");
	private JButton btnPerfil = new JButton("Meu perfil");
	private JButton btnEstante = new JButton("Estante");
	private ControleTelaLeitor controleTelaLeitor;
	
	public TelaLeitor() {
		super("Menu"); // JFrame com nome
		this.controleTelaLeitor = new ControleTelaLeitor(this);
		
		// Estilo de texto
		titulo.setFont(new Font("Roboto", Font.BOLD, 40));
		titulo.setForeground(Color.WHITE);
		
		mensagem.setFont(new Font("Roboto", Font.PLAIN, 20));
		mensagem.setForeground(Color.WHITE);
		
		// (x, y, whidth, height)
		titulo.setBounds(110, 20, 340, 50);
		mensagem.setBounds(130, 70, 300, 30);
		btnLivro.setBounds(40, 630, 140, 20);
		btnPerfil.setBounds(200, 630, 140, 20);
		btnEstante.setBounds(360, 630, 140, 20);
		
		// Fonte dos botoes e labels
		Font fonte = new Font("Roboto", Font.PLAIN,  12);
		btnLivro.setFont(fonte);
		btnPerfil.setFont(fonte);
		btnEstante.setFont(fonte);
		
		// Cor dos botoes
		btnLivro.setBackground(new Color(0, 130, 93));
		btnLivro.setForeground(Color.WHITE);
		btnLivro.setBorder(null);
		btnPerfil.setBackground(new Color(0, 130, 93));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnEstante.setBackground(new Color(0, 130, 93));
		btnEstante.setForeground(Color.WHITE);
		btnEstante.setBorder(null);
		
		// Adicionando componentes a tela
		this.add(titulo);
		this.add(mensagem);
		this.add(btnLivro);
		this.add(btnPerfil);
		this.add(btnEstante);
		
		// Cor do plano de fundo da tela
		getContentPane().setBackground(new Color(3, 192, 122));
				
		// Estilo da janela
		this.setSize(560, 800);
		this.setLayout(null);
		this.setResizable(false);

		this.setVisible(true);
		
		btnLivro.addActionListener(this.controleTelaLeitor);
		btnPerfil.addActionListener(this.controleTelaLeitor);
		btnEstante.addActionListener(this.controleTelaLeitor);
	}
	
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

	public JButton getBtnLivro() {
		return btnLivro;
	}

	public void setBtnLivro(JButton btnLivro) {
		this.btnLivro = btnLivro;
	}

	public JButton getBtnPerfil() {
		return btnPerfil;
	}

	public void setBtnPerfil(JButton btnPerfil) {
		this.btnPerfil = btnPerfil;
	}

	public JButton getBtnEstante() {
		return btnEstante;
	}

	public void setBtnEstante(JButton btnEstante) {
		this.btnEstante = btnEstante;
	}
}