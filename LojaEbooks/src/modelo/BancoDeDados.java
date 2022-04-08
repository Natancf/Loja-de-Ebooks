package modelo;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe modelo dos dados do sistema
 * 
 * @author Natanael Costa de Freitas
 */
public class BancoDeDados {
	public static int qtdPessoas = 5;
	
	/**
	 *  lista que guarda todos os valores de Editoras e Leitores
	 */
	public static List<Object> pessoas = new ArrayList<Object>();
	
	/**
	 *  lista que guarda todos os valores de Ebooks
	 */
	public static List<Ebook> ebook = new ArrayList<Ebook>();
	
	/**
	 *  lista que guarda todos os valores de Estante
	 */
	public static List<Estante> ebooksComprados = new ArrayList<Estante>();


}
