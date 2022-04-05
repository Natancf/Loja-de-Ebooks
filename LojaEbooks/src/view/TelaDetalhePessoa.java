package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhePessoa implements ActionListener {

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
    private JTextField valorSenha;
    private JLabel labelTelefone = new JLabel("Telefone");
    private JTextField valorDDD;
    private JTextField valorTelefone;
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[9];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d,
            TelaPessoa p, int pos) {

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

        janela = new JFrame(s);

        // Preenche dados com dados do Leitor clicado
        if (op == 3) {
            valorNome = new JTextField(dados.getLeitores()[pos].getNome(), 200);
            valorEmail = new JTextField(dados.getEditoras()[pos].getEmail(), 200);
            valorCPF = new JTextField(String.valueOf(dados.getLeitores()[pos].getCpf()), 200);
            valorID = new JTextField(String.valueOf(dados.getLeitores()[pos].getId()), 200);
            valorDDD = new JTextField(String.valueOf(dados.getLeitores()[pos].getNumeroTelefone().getDDD()), 3);
            valorTelefone = new JTextField(String.valueOf(dados.getLeitores()[pos].getNumeroTelefone().getNumero()), 10);
            valorSenha = new JTextField(String.valueOf(dados.getLeitores()[pos].getSenha()), 200);

        } else if (op == 4) { // Preenche dados com dados do Editora clicado
            valorNome = new JTextField(dados.getEditoras()[pos].getNome(), 200);
            valorEmail = new JTextField(dados.getEditoras()[pos].getEmail(), 200);
            valorCNPJ = new JTextField(String.valueOf(dados.getEditoras()[pos].getCnpj()), 200);
            valorID = new JTextField(String.valueOf(dados.getEditoras()[pos].getId()), 200);
            valorDDD = new JTextField(String.valueOf(dados.getEditoras()[pos].getNumeroTelefone().getDDD()), 3);
            valorTelefone = new JTextField(String.valueOf(dados.getEditoras()[pos].getNumeroTelefone().getNumero()), 10);
            valorSenha = new JTextField(String.valueOf(dados.getEditoras()[pos].getSenha()), 200);

        } else { // Não preenche com dados

            valorNome = new JTextField(200);
            valorEmail = new JTextField(200);
            valorSenha = new JTextField(200);
            valorCPF = new JTextField(200);
            valorCNPJ = new JTextField(200);
            valorID = new JTextField(200);
            valorDDD = new JTextField(3);
            valorTelefone = new JTextField(10);

            botaoSalvar.setBounds(245, 175, 115, 30);
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        labelEmail.setBounds(30, 50, 150, 25);
        valorEmail.setBounds(180, 50, 180, 25);
        labelSenha.setBounds(30, 50, 180, 25);
        valorSenha.setBounds(180, 50, 180, 25);
        labelCPF.setBounds(30, 80, 150, 25);
        valorCPF.setBounds(180, 80, 180, 25);
        labelCNPJ.setBounds(30, 80, 150, 25);
        valorCNPJ.setBounds(180, 80, 180, 25);
        labelID.setBounds(30, 110, 150, 25);
        valorID.setBounds(180, 110, 180, 25);
        labelTelefone.setBounds(30, 140, 150, 25);
        valorDDD.setBounds(180, 140, 28, 25);
        valorTelefone.setBounds(210, 140, 65, 25);

        // Coloca botoes de excluir e salvar
        if (op == 3 || op == 4) {
            botaoSalvar.setBounds(120, 175, 115, 30);
            botaoExcluir.setBounds(245, 175, 115, 30);
            this.janela.add(botaoExcluir);
        }

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelEmail);
        this.janela.add(valorEmail);
        this.janela.add(labelSenha);
        this.janela.add(valorSenha);
        this.janela.add(labelCPF);
        this.janela.add(valorCPF);
        this.janela.add(labelCNPJ);
        this.janela.add(valorCNPJ);
        this.janela.add(labelID);
        this.janela.add(valorID);
        this.janela.add(labelTelefone);
        this.janela.add(valorDDD);
        this.janela.add(valorTelefone);
        this.janela.add(botaoSalvar);

        this.janela.setLayout(null);

        this.janela.setSize(400, 250);
        this.janela.setVisible(true);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoSalvar) {
            try {
                boolean res;
                if (opcao == 1) // cadastro de novo Leitor
                    novoDado[0] = Integer.toString(dados.getQtdLeitores());
                else if (opcao == 2) // cadastro de novo Editora
                    novoDado[0] = Integer.toString(dados.getQtdEditoras());
                else // edicao de dado existente
                    novoDado[0] = Integer.toString(posicao);

                novoDado[1] = valorNome.getText();
                novoDado[2] = valorEmail.getText();
                novoDado[3] = valorCPF.getText();
                novoDado[4] = valorID.getText();
                novoDado[5] = valorDDD.getText();
                novoDado[6] = valorTelefone.getText();
                novoDado[6] = valorSenha.getText();

                if (opcao == 1 || opcao == 3) {
                    novoDado[2] = valorEmail.getText();
                    res = dados.inserirEditarLeitor(novoDado);
                } else {
                    novoDado[2] = valorEmail.getText();
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
                + "2. CPF, identidade, DDD e telefone não contém apenas números", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoLeitor() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
                + "Verifique se o Leitor está matriculado\n"
                + "em alguma disciplina. Se sim, cancele\n "
                + "a matricula e tente novamente.", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoEditora() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
                + "Verifique se o Editora está responsável\n"
                + "o Editora e tente novamente.", null,
                JOptionPane.ERROR_MESSAGE);
    }

}
