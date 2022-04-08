package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Tela para o Cadastro de Pessoas
 * 
 * @author Natanael Costa de Freitas
 */
public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JPanel mostrarDados;
    private JFrame janela;
    private JLabel titulo = new JLabel("Ebook's Store", JLabel.CENTER);
    private JButton cadastroLeitor;
    //private JButton refreshLeitor;
    private JButton cadastroEditora;
    //private JButton refreshEditora;
    private static ControleDados dados;
    private JList<String> listaLeitoresCadastrados;
    private JList<String> listaEditorasCadastradas;
    private String[] listaNomes = new String[50];

	private JRadioButton rdbtnEditora = new JRadioButton("Editora");
	private JRadioButton rdbtnLeitor = new JRadioButton("Leitor");
	private int AccountType ;
	ButtonGroup group;
	
	/**
	 * Tela de cadastro, verifica se o usuário e um Editora ou Leitor
	 * 
	 * @param d - ControleDados
	 * @param op - int
	 */
    public void mostrarDados(ControleDados d, int op) {
        dados = d;
        janela = new JFrame("Cadastro");
        titulo = new JLabel("Cadastrar");
        cadastroLeitor = new JButton("Cadastrar");

        titulo.setFont(new Font("Roboto", Font.BOLD, 40));
        titulo.setBounds(90, 10, 250, 30);

        cadastroLeitor.setBounds(10, 177, 520, 30);
        cadastroLeitor.setBackground(new Color(3, 130, 93));
        cadastroLeitor.setForeground(Color.WHITE);
        janela.add(titulo);
        janela.add(cadastroLeitor);
        
        rdbtnEditora = new JRadioButton("Editora");
        setRdbtnLeitor(new JRadioButton("Leitor"));
        rdbtnEditora.setBounds(150, 147, 100, 30);
        getRdbtnLeitor().setBounds(320, 147, 100, 30);
        janela.add(rdbtnEditora);
        janela.add(getRdbtnLeitor());
        
        janela.setLayout(null);
        janela.setSize(560, 800);
        janela.setVisible(true);
        janela.setBackground(new Color(3, 192, 122));
        
        cadastroLeitor.addActionListener(this);
        rdbtnEditora.addActionListener(this);
        getRdbtnLeitor().addActionListener(this);
        
        group = new ButtonGroup();
    	group.add(rdbtnEditora);
    	group.add(getRdbtnLeitor());
    	
    	
    }

	// Captura eventos relacionados aos botões da interface
    /**
     * Verifica se o botão cadastrar e o radio Button foi selecionado
     * 
     * @param e - ActionEvent
     */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        // Cadastro de novo Leitor
        if (src == cadastroLeitor && rdbtnLeitor.isSelected())
            new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

        // Cadastro de novo Editora
        if (src == cadastroLeitor && rdbtnEditora.isSelected())
            new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

    }

    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaLeitoresCadastrados) {
            new TelaDetalhePessoa().inserirEditar(3, dados, this,
                    listaLeitoresCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaEditorasCadastradas) {
            new TelaDetalhePessoa().inserirEditar(4, dados, this,
                    listaEditorasCadastradas.getSelectedIndex());
        }
    }

    // Gets e Sets
	public JRadioButton getRdbtnLeitor() {
		return rdbtnLeitor;
	}

	public void setRdbtnLeitor(JRadioButton rdbtnLeitor) {
		this.rdbtnLeitor = rdbtnLeitor;
	}
	
	public JRadioButton getRdbtnEditora() {
		return rdbtnEditora;
	}

	public void setRdbtnEditora(JRadioButton rdbtnEditora) {
		this.rdbtnEditora = rdbtnEditora;
	}	

}