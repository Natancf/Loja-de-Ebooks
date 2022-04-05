package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroLeitor;
    private JButton refreshLeitor;
    private JButton cadastroEditora;
    private JButton refreshEditora;
    private static ControleDados dados;
    private JList<String> listaLeitoresCadastrados;
    private JList<String> listaEditorasCadastrados;
    private String[] listaNomes = new String[50];

    public void mostrarDados(ControleDados d, int op) {
        dados = d;

        switch (op) {
            case 1:// Mostrar dados de Leitores cadastrados (JList)
                listaNomes = new ControleLeitor(dados).getNomeLeitor();
                listaLeitoresCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Leitores");
                titulo = new JLabel("Leitores Cadastrados");
                cadastroLeitor = new JButton("Cadastrar");
                refreshLeitor = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaLeitoresCadastrados.setBounds(20, 50, 350, 120);
                listaLeitoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaLeitoresCadastrados.setVisibleRowCount(10);

                cadastroLeitor.setBounds(70, 177, 100, 30);
                refreshLeitor.setBounds(200, 177, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaLeitoresCadastrados);
                janela.add(cadastroLeitor);
                janela.add(refreshLeitor);

                janela.setSize(400, 250);
                janela.setVisible(true);

                cadastroLeitor.addActionListener(this);
                refreshLeitor.addActionListener(this);
                listaLeitoresCadastrados.addListSelectionListener(this);

                break;

            case 2:// Mostrar dados de Editoraessores cadastrados (JList)
                listaNomes = new ControleEditora(dados).getNomeEditora();
                listaEditorasCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Editoraessores");
                titulo = new JLabel("Editoraessores Cadastrados");
                cadastroEditora = new JButton("Cadastrar");
                refreshEditora = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaEditorasCadastrados.setBounds(20, 50, 350, 120);
                listaEditorasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaEditorasCadastrados.setVisibleRowCount(10);

                cadastroEditora.setBounds(70, 177, 100, 30);
                refreshEditora.setBounds(200, 177, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaEditorasCadastrados);
                janela.add(cadastroEditora);
                janela.add(refreshEditora);

                janela.setSize(400, 250);
                janela.setVisible(true);

                cadastroEditora.addActionListener(this);
                refreshEditora.addActionListener(this);
                listaEditorasCadastrados.addListSelectionListener(this);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null,
                        JOptionPane.ERROR_MESSAGE);
        }

    }

    // Captura eventos relacionados aos botões da interface
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Cadastro de novo Leitor
        if (src == cadastroLeitor)
            new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

        // Cadastro de novo Editoraessor
        if (src == cadastroEditora)
            new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

        // Atualiza a lista de nomes de Leitores mostrada no JList
        if (src == refreshLeitor) {
            listaLeitoresCadastrados.setListData(new ControleLeitor(dados).getNomeLeitor());
            listaLeitoresCadastrados.updateUI();
        }

        // Atualiza a lista de nomes de Editoraessores mostrada no JList
        if (src == refreshEditora) {
            listaEditorasCadastrados.setListData(new ControleEditora(dados).getNomeEditora());
            listaEditorasCadastrados.updateUI();
        }

    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaLeitoresCadastrados) {
            new TelaDetalhePessoa().inserirEditar(3, dados, this,
                    listaLeitoresCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaEditorasCadastrados) {
            new TelaDetalhePessoa().inserirEditar(4, dados, this,
                    listaEditorasCadastrados.getSelectedIndex());
        }
    }

}