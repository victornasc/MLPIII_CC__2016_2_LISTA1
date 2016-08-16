package exercicio4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Fita fita = new Fita();
		Autor autor = new Autor();
		Scanner leitor = new Scanner(System.in);
		
		String titulo;
		String nomeAutor;
		
		System.out.println("Informe o nome do filme:");
		titulo = leitor.nextLine();
		
		System.out.println("Digite o nome do autor: ");
		nomeAutor = leitor.nextLine();
		
		autor.setNomeAutor(nomeAutor);
		fita.setAutor(autor);
		
		fita.setTitulo(titulo);
		fita.locarFitas();
		
		
	}

	
}
