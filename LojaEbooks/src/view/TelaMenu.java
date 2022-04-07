package view;

import java.util.Scanner;

import controle.*;

import modelo.*;

/**
 * Classe Main.
 * 
 * @author Natanael Costa de Freitas
 */

public class TelaMenu {

    private static ControleDados dados;
	public static Pessoa activeUser;

	
	public static void main(String[] args) {
		
		Dados.fillWithSomeData();
		TelaLogin principal = new TelaLogin();
	}

}