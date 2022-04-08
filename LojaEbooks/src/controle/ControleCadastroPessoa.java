package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modelo.BancoDeDados;
import modelo.Dados;
import modelo.Pessoa;
import modelo.Telefone;
import view.*;

/**
 * Classe que controla o cadastro de pessoas
 * Responsável por realizar login de um usuario
 * 
 * @author Natanael Costa De Freitas
 * @see view.TelaCadastroLeitor
 */

public class ControleCadastroPessoa implements ActionListener {

	private ControleLeitor controleLeitor;
	private ControleEditora controleEditora;
	private ControleDados controleDados;
	private final TelaDetalhePessoa cadastroPessoa;
	private final TelaPessoa Pessoa;
	
	public ControleCadastroPessoa (TelaDetalhePessoa telaDetalhePessoa) {
		this.cadastroPessoa = telaDetalhePessoa;
		this.Pessoa = new TelaPessoa();
	}
	
	/**
	 * Compara o email cadastrado com algum email no sistema
	 * 
	 * @param userText - String
	 * @param passwordText - String
	 */
	public static boolean login(String userText, String passwordText) {
        
		// Percorre a lista comparando se o email e senha inseridos é igual ao de alguma das instancias
		Dados d = new Dados();
		for(Object ob : BancoDeDados.pessoas) {
			// CAST de Object (Generico) para Usuario
			if(((Pessoa) ob).getEmail().equals(userText) && ((Pessoa) ob).getSenha().equals(passwordText)) {
				// Copia do objeto
				TelaMenu.activeUser = ((Pessoa) ob);
				return true;
			}
		}
		return false;
	}

	/**
	 * Cadastra um novo Leitor, caso o cadastro seja realizado com sucesso abre a tela de login, caso contrário exibe mensagem de erro
	 * 
	 * @param e - ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		
		if(eventSource == cadastroPessoa.getBotaoSalvar()) {
			if(ControleLeitor.cadastrar(cadastroPessoa.getValorNome().getText(), cadastroPessoa.getValorEmail().getText(), cadastroPessoa.getValorSenha().getText(), new Telefone((Integer.parseInt(cadastroPessoa.getValorDDD().getText())),Integer.parseInt(cadastroPessoa.getValorTelefone().getText())))) {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
				new TelaLogin();
			}
			else {
				// Class que cria uma caixa de dialogo para retornar uma informacao ao usuario
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar! Tente novamente", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
