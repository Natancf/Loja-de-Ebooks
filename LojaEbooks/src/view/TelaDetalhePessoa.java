package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhePessoa extends JFrame {

    private JFrame janela;
    private JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private JLabel labelEmail = new JLabel("Email: ");
    private JTextField valorEmail;
    private JLabel labelCPF = new JLabel("CPF: ");
    private JTextField valorCPF;
    private JLabel labelCNPJ = new JLabel("CNPJ: ");
    private JTextField valorCNPJ;
    private JLabel labelID = new JLabel("Numero Id: ");
    private JTextField valorID;
    private JLabel labelSenha = new JLabel("Senha: ");
    private JPasswordField valorSenha;
    private JLabel labelTelefone = new JLabel("Telefone");
    private JTextField valorDDD;
    private JTextField valorTelefone;
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[20];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;
    private int pessoa;
	private ControleCadastroPessoa telaDetalhePessoa;

    public void inserirEditar(int op, ControleDados d,TelaPessoa p, int pos) {
        // JFrame com nome
    	this.telaDetalhePessoa = new ControleCadastroPessoa(this);
		
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
            valorNome = new JTextField(dados.getLeitores()[pos].getNome(), 200);
            valorEmail = new JTextField(dados.getLeitores()[pos].getEmail(), 200);
//            valorCPF = new JTextField(String.valueOf(dados.getLeitores()[pos].getCpf()), 11);
//            valorCNPJ = new JTextField(200);
            valorID = new JTextField(String.valueOf(dados.getLeitores()[pos].getId()), 200);
            valorDDD = new JTextField(String.valueOf(dados.getLeitores()[pos].getNumeroTelefone().getDDD()), 3);
            valorTelefone = new JTextField(String.valueOf(dados.getLeitores()[pos].getNumeroTelefone().getNumero()), 10);
            valorSenha = new JPasswordField(dados.getLeitores()[pos].getSenha(), 200);

        } else if (op == 4) { // Preenche dados com dados do Editora clicado
            valorNome = new JTextField(dados.getEditoras()[pos].getNome(), 200);
            valorEmail = new JTextField(dados.getEditoras()[pos].getEmail(), 200);
//            valorCNPJ = new JTextField(String.valueOf(dados.getEditoras()[pos].getCnpj()), 14);
//            valorCPF = new JTextField(200);
            valorID = new JTextField(String.valueOf(dados.getEditoras()[pos].getId()), 200);
            valorDDD = new JTextField(String.valueOf(dados.getEditoras()[pos].getNumeroTelefone().getDDD()), 3);
            valorTelefone = new JTextField(String.valueOf(dados.getEditoras()[pos].getNumeroTelefone().getNumero()), 10);
            valorSenha = new JPasswordField(dados.getEditoras()[pos].getSenha(), 200);

        } else { // Não preenche com dados

            valorNome = new JTextField(200);
            valorEmail = new JTextField(200);
            valorSenha = new JPasswordField(200);
//            valorCPF = new JTextField(200);
//            valorCNPJ = new JTextField(200);
            valorID = new JTextField(200);
            valorDDD = new JTextField(3);
            valorTelefone = new JTextField(10);

            botaoSalvar.setBounds(245, 235, 115, 30);
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        labelEmail.setBounds(30, 50, 150, 25);
        valorEmail.setBounds(180, 50, 180, 25);
        labelSenha.setBounds(30, 80, 180, 25);
        valorSenha.setBounds(180, 80, 180, 25);
//        labelCPF.setBounds(30, 110, 150, 25);
//        valorCPF.setBounds(180, 110, 180, 25);
//        labelCNPJ.setBounds(30, 110, 150, 25);
//        valorCNPJ.setBounds(180, 110, 180, 25);
        labelID.setBounds(30, 140, 150, 25);
        valorID.setBounds(180, 140, 180, 25);
        labelTelefone.setBounds(30, 170, 150, 25);
        valorDDD.setBounds(180, 170, 28, 25);
        valorTelefone.setBounds(210, 170, 65, 25);

        // Coloca campo relacionado ao cpf de leitor
//      if (op == 1 || op == 3 ) {
//			this.add(labelCPF);
//			this.add(valorCPF);
//
//		}
//
//		//Coloca campos relacionados ao cnpj de editor
//		if (op == 2 || op == 4) {
//
//			this.add(labelCNPJ);
//			this.add(valorCNPJ);
//		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 215, 115, 30);
			botaoExcluir.setBounds(245, 215, 115, 30);
			this.add(botaoExcluir);
		}

        this.add(labelNome);
        this.add(valorNome);
        this.add(labelEmail);
        this.add(valorEmail);
        this.add(labelID);
        this.add(valorID);
        this.add(labelTelefone);
        this.add(valorDDD);
        this.add(valorTelefone);
        this.add(labelSenha);
        this.add(valorSenha);
        this.add(botaoSalvar);

        this.setLayout(null);

        this.setSize(560, 800);
        this.setVisible(true);

        botaoSalvar.addActionListener(this.telaDetalhePessoa);
        botaoExcluir.addActionListener(this.telaDetalhePessoa);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoSalvar) {
            try {
                boolean res;
                if (opcao == 1) {// cadastro de novo Leitor
                    novoDado[0] = Integer.toString(dados.getQtdLeitores());
                	pessoa = 1;
                }
                else if (opcao == 2) {// cadastro de novo Editora
                    novoDado[0] = Integer.toString(dados.getQtdEditoras());
                    pessoa = 2;
                }
                else // edicao de dado existente
                    novoDado[0] = Integer.toString(posicao);
                
                novoDado[1] = valorNome.getText();
                novoDado[2] = valorEmail.getText();
                novoDado[3] = valorSenha.getText();
                novoDado[5] = valorID.getText();
                novoDado[6] = valorDDD.getText();
                novoDado[7] = valorTelefone.getText();
                

                if (opcao == 1 || opcao == 3) {
                    novoDado[4] = valorCPF.getText();
                    res = dados.inserirEditarLeitor(novoDado);
                } else {
                    novoDado[4] = valorCNPJ.getText();
                    res = dados.inserirEditarEditora(novoDado);
                }

                if (res) {
                    mensagemSucessoCadastro();
                } else
                    mensagemErroCadastro();

            } catch (NullPointerException exc1) {
                mensagemErroCadastro();
            } catch (NumberFormatException exc2) {
                mensagemErroCadastro();
            }
        }

        if (src == botaoExcluir) {
            boolean res = false;

            if (opcao == 3) {// exclui Leitor
                res = dados.removerLeitor(posicao);
                if (res)
                    mensagemSucessoExclusao();
                else
                    mensagemErroExclusaoLeitor();
            }

            if (opcao == 4) { // exclui Editora
                res = dados.removerEditora(posicao);
                if (res)
                    mensagemSucessoExclusao();
                else
                    mensagemErroExclusaoEditora();
            }

        }
    }

    public void mensagemSucessoExclusao() {
        JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS!\n "
                + "Pode ter ocorrido um dos dois erros a seguir:  \n"
                + "1. Nem todos os campos foram preenchidos \n"
                + "2. CPF/CNPJ, id, DDD e telefone não contém apenas números", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoLeitor() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado. ", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoEditora() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado. ", null,
                JOptionPane.ERROR_MESSAGE);
    }
    
    public JButton getBotaoSalvar() {
		return botaoSalvar;
	}

	public void setBotaoSalvar(JButton botaoSalvar) {
		this.botaoSalvar = botaoSalvar;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JTextField getValorNome() {
		return valorNome;
	}

	public void setValorNome(JTextField valorNome) {
		this.valorNome = valorNome;
	}

	public JLabel getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}

	public JTextField getValorEmail() {
		return valorEmail;
	}

	public void setValorEmail(JTextField valorEmail) {
		this.valorEmail = valorEmail;
	}

	public JLabel getLabelCPF() {
		return labelCPF;
	}

	public void setLabelCPF(JLabel labelCPF) {
		this.labelCPF = labelCPF;
	}

	public JTextField getValorCPF() {
		return valorCPF;
	}

	public void setValorCPF(JTextField valorCPF) {
		this.valorCPF = valorCPF;
	}

	public JLabel getLabelCNPJ() {
		return labelCNPJ;
	}

	public void setLabelCNPJ(JLabel labelCNPJ) {
		this.labelCNPJ = labelCNPJ;
	}

	public JTextField getValorCNPJ() {
		return valorCNPJ;
	}

	public void setValorCNPJ(JTextField valorCNPJ) {
		this.valorCNPJ = valorCNPJ;
	}

	public JLabel getLabelID() {
		return labelID;
	}

	public void setLabelID(JLabel labelID) {
		this.labelID = labelID;
	}

	public JTextField getValorID() {
		return valorID;
	}

	public void setValorID(JTextField valorID) {
		this.valorID = valorID;
	}

	public JLabel getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JLabel labelSenha) {
		this.labelSenha = labelSenha;
	}

	public JPasswordField getValorSenha() {
		return valorSenha;
	}

	public void setValorSenha(JPasswordField valorSenha) {
		this.valorSenha = valorSenha;
	}

	public JLabel getLabelTelefone() {
		return labelTelefone;
	}

	public void setLabelTelefone(JLabel labelTelefone) {
		this.labelTelefone = labelTelefone;
	}

	public JTextField getValorDDD() {
		return valorDDD;
	}

	public void setValorDDD(JTextField valorDDD) {
		this.valorDDD = valorDDD;
	}

	public JTextField getValorTelefone() {
		return valorTelefone;
	}

	public void setValorTelefone(JTextField valorTelefone) {
		this.valorTelefone = valorTelefone;
	}

	public JButton getBotaoExcluir() {
		return botaoExcluir;
	}

	public void setBotaoExcluir(JButton botaoExcluir) {
		this.botaoExcluir = botaoExcluir;
	}
	
	public int getPessoa() {
		return pessoa;
	}

	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}

}
