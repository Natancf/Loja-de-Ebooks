package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JOptionPane;

import modelo.*;

import java.util.Scanner;

import view.*;

public class ControleLogin implements ActionListener {

	private final TelaLogin principal;
    //private static ControleDados dados;
    private static ControleLeitor leitorDados;
    private static ControleEditora editoraDados;
    private static JList<String> listaLeitoresCadastrados;
    private static String[] listaEmail = new String[50];
    public static ControleDados dados = new ControleDados();
	
	public ControleLogin(TelaLogin principal) {
		this.principal = principal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		
		if(eventSource == principal.getBtnLogin()) {
			if(login(principal.getUserText().getText(), principal.getPasswordText().getText())) {
				if(TelaMenu.activeUser.isAdmin())
					new TelaEditora();
				else 
					new TelaLeitor();
			}
			else {
				// Class que cria uma caixa de dialogo para retornar uma informacao ao usuario
				JOptionPane.showMessageDialog(null, "Login invalido! Tente novamente", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(eventSource == principal.getBtnCadastrar()){
			new TelaPessoa().mostrarDados(dados, 1);
		}
	}
		
	Scanner input = new Scanner(System.in);
	public static boolean login(String userText, String passwordText) {
        
		// Percorre a lista comparando se o email e senha inseridos � igual ao de alguma das instancias
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
}