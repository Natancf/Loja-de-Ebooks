package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleTelaEditora;

/**
 * Tela Editora
 * 
 * @author Natanael Costa de Freitas
 * @see javax.swing.JFrame
 */
public class TelaEditora extends JFrame {

    private JLabel titulo = new JLabel("Menu", JLabel.CENTER);
    private JLabel mensagem = new JLabel("Clique para gerenciar", JLabel.CENTER);
    private JButton btnEbook = new JButton("Ebooks");
    private JButton btnCadastrarEbook = new JButton("Cadastrar Ebook");
    private JButton btnEditora = new JButton("Editoras");
    private ControleTelaEditora controleTelaEditora;

    /**
     * Tela de menu de Editora
     */
    public TelaEditora() {
        super("Menu"); // JFrame com nome
        this.controleTelaEditora = new ControleTelaEditora(this);

        // Estilo de texto
        titulo.setFont(new Font("Roboto", Font.BOLD, 40));
        titulo.setForeground(Color.WHITE);

        mensagem.setFont(new Font("Roboto", Font.PLAIN, 20));
        mensagem.setForeground(Color.WHITE);

        // (x, y, whidth, height)
        titulo.setBounds(110, 20, 340, 50);
        mensagem.setBounds(130, 70, 300, 30);
        btnEbook.setBounds(40, 630, 140, 20);
        btnCadastrarEbook.setBounds(200, 630, 140, 20);
        btnEditora.setBounds(360, 630, 140, 20);
        
        // Fonte dos botoes e labels
        Font fonte = new Font("Roboto", Font.PLAIN, 12);
        btnEbook.setFont(fonte);
        btnCadastrarEbook.setFont(fonte);
        btnEditora.setFont(fonte);

        // Cor dos botoes
        btnEbook.setBackground(new Color(0, 130, 93));
        btnEbook.setBorder(null);
        btnEbook.setForeground(Color.WHITE);
        btnCadastrarEbook.setBackground(new Color(0, 130, 93));
        btnCadastrarEbook.setBorder(null);
        btnCadastrarEbook.setForeground(Color.WHITE);
        btnEditora.setBackground(new Color(0, 130, 93));
        btnEditora.setBorder(null);
        btnEditora.setForeground(Color.WHITE);

        // Adicionando componentes a tela
        this.add(titulo);
        this.add(mensagem);
        this.add(btnEbook);
        this.add(btnCadastrarEbook);
        this.add(btnEditora);

        // Cor do plano de fundo da tela
        getContentPane().setBackground(new Color(3, 192, 122));

        // Estilo da janela
        this.setSize(560, 800);
        this.setLayout(null);
        this.setResizable(false);

        this.setVisible(true);

        btnEbook.addActionListener(this.controleTelaEditora);
        btnCadastrarEbook.addActionListener(this.controleTelaEditora);
        btnEditora.addActionListener(this.controleTelaEditora);
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

    public JButton getBtnEbook() {
        return btnEbook;
    }

    public void setBtnEbook(JButton btnEbook) {
        this.btnEbook = btnEbook;
    }

    public JButton getBtnCadastrarEbook() {
        return btnCadastrarEbook;
    }

    public void setBtnCadastrarEbook(JButton btnCadastrarEbook) {
        this.btnCadastrarEbook = btnCadastrarEbook;
    }

    public JButton getBtnEditora() {
        return btnEditora;
    }

    public void setBtnEditora(JButton btnEditora) {
        this.btnEditora = btnEditora;
    }

}
