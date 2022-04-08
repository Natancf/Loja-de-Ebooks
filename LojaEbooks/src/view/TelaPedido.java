package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controle.ControleCadastroPessoa;
import controle.ControleDados;
import controle.ControlePedido;

/**
 * Tela para realizar o pedido
 * 
 * @author Natanael Costa de Freitas
 * @see javax.swing.JFrame
 */
public class TelaPedido extends JFrame{
	private JPanel TelaPedido;
	private static JTextField FirstName;
	private static JTextField LastName;
	private static JTextField Email;
	private static JLabel carttotal;
	private static JTextField cc;
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	private ControlePedido telaPedido;
	private JLabel tituloEbook;
	private JLabel autorEbook;
	private JLabel generoEbook;
	private JLabel descricaoEbook;
	private JLabel precoEbook;
	private JLabel idiomaEbook;
	private JLabel editoraEbook;
	private JButton botaoComprar = new JButton("Comprar");
	private JButton botaoCancelar = new JButton("Cancelar");
	private String[] novoDado = new String[20];

	public TelaPedido() {
	}

	/**
	 * Realiza a operação de compra
	 * 
	 * @param op - int
	 * @param d - ControleDados
	 * @param telaEstante - TelaEstante
	 * @param pos - int
	 */
	public void comprar(int op, ControleDados d,TelaEstante telaEstante, int pos) {
		// JFrame com nome
    	this.telaPedido = new ControlePedido(this);
		
        opcao = op;
        posicao = pos;
        dados = d;

        if (op == 1) 
        	s = "Cadastro de Leitor";
        if (op == 2)
            s = "Cadastro de Editora";
        if (op == 3)
            s = "Detalhe de Leitor";
        if (op == 4)
            s = "Detalhe de Editora";

        // Preenche dados com dados do Leitor clicado
        if (op == 3) {
			tituloEbook = new JLabel(dados.getEbooks()[pos].getTitulo(), SwingConstants.LEFT);
			autorEbook = new JLabel(dados.getEbooks()[pos].getNomeAutor(), SwingConstants.LEFT);
			generoEbook = new JLabel(dados.getEbooks()[pos].getGenero(), SwingConstants.LEFT);
			descricaoEbook = new JLabel(dados.getEbooks()[pos].getDescricao(), SwingConstants.LEFT);
			idiomaEbook = new JLabel(dados.getEbooks()[pos].getIdioma(), SwingConstants.LEFT);
			editoraEbook = new JLabel(dados.getEbooks()[pos].getEditora(), SwingConstants.LEFT);
			precoEbook = new JLabel(String.valueOf(dados.getEbooks()[pos].getPreco()), SwingConstants.LEFT);

            botaoComprar.setBounds(245, 235, 115, 30);
        }

        tituloEbook.setBounds(30, 20, 150, 25);
        autorEbook.setBounds(30, 50, 150, 25);
        generoEbook.setBounds(30, 80, 180, 25);
        descricaoEbook.setBounds(30, 110, 180, 25);
        idiomaEbook.setBounds(30, 140, 180, 25);
        editoraEbook.setBounds(30, 170, 180, 25);
        precoEbook.setBounds(30, 200, 180, 25);

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoComprar.setBounds(120, 205, 115, 30);
			this.add(botaoComprar);
			this.add(botaoCancelar);
		}

        this.add(tituloEbook);
        this.add(autorEbook);
        this.add(generoEbook);
        this.add(descricaoEbook);
        this.add(idiomaEbook);
        this.add(editoraEbook);
        this.add(precoEbook);

        this.setLayout(null);

        this.setSize(500, 350);
        this.setVisible(true);

        botaoComprar.addActionListener(this.telaPedido);
        botaoCancelar.addActionListener(this.telaPedido);
	}
	
	/**
	 * verifica se o botão compra foi acionado e realiza as devidas operações
	 * 
	 * @param e - ActionEvent 
	 */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoComprar) {
            boolean res;
            if (opcao == 1) {// cadastro de novo Leitor
                novoDado[0] = Integer.toString(dados.getQtdEbooks());
            }
            else // edicao de dado existente
                novoDado[0] = Integer.toString(posicao);
            
            novoDado[1] =  tituloEbook.getText();
			novoDado[3] =  autorEbook.getText();
			novoDado[4] =  generoEbook.getText();
			novoDado[5] =  descricaoEbook.getText();
			novoDado[6] =  idiomaEbook.getText();
			novoDado[7] =  editoraEbook.getText();
			novoDado[8] =  precoEbook.getText();
        }

        if (src == botaoCancelar) {
            boolean res = false;

            if (opcao == 3) {// exclui Leitor
                res = dados.removerLeitor(posicao);
            }

        }
    }

	// Gets e Sets
	public JPanel getPanel() {
		return TelaPedido;
	}

	public static String getFirstName() {
		try {
			return FirstName.getText();
		} catch (NullPointerException n) {
			return "null";
		}
	}

	public static String getLastName() {
		try {
			return LastName.getText();
		} catch (NullPointerException n) {
			return "null";
		}
	}


	public static String getEmail() {
		try {
			return Email.getText();
		} catch (NullPointerException n) {
			return "null";
		}
	}

	public static void setTotalText(float cartTotal) {
		carttotal.setText("TOTAL: " + cartTotal);
	}

	public static String getCreditCard() {
		try {
			return cc.getText();
		} catch (NullPointerException n) {
			return "null";
		}
	}
	
	public void inserirEstante(int op, ControleDados d, TelaPessoa p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Finalizar Pedido";
	}
}
