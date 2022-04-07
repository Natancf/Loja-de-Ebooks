package modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	public static int geraId = 5;
	
	// Lista generica - guarda todas as instancias de Admin e Cliente
	public static List<Object> pessoas = new ArrayList<Object>();
	
	// Lista para guardar todos os livros
	public static List<Ebook> ebook = new ArrayList<Ebook>();
	
	// Lista para guardar todos as vendas
	public static List<Estante> vendas = new ArrayList<Estante>();


}
