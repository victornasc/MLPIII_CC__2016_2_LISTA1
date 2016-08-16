package exercicio4;

import java.util.Scanner;

public class Fita {

	String titulo;
	String categoria;
	double precoFixo = 10.00;
	double fitaLancamento = (precoFixo * 0.2) + precoFixo;
	double fitaInfantil = (precoFixo * -0.4) + precoFixo;
	private Autor autor;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecoFixo() {
		return precoFixo;
	}
	public void setPrecoFixo(double precoFixo) {
		this.precoFixo = precoFixo;
	}
	public double getFitaLancamento() {
		return fitaLancamento;
	}
	public void setFitaLancamento(double fitaLancamento) {
		this.fitaLancamento = fitaLancamento;
	}
	public double getFitaInfantil() {
		return fitaInfantil;
	}
	public void setFitaInfantil(double fitaInfantil) {
		this.fitaInfantil = fitaInfantil;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {

		this.autor = autor;
	}
	
public Fita(){
		
	}
		public double locarFitas(){
			Scanner leitor = new Scanner(System.in);

			int controlador;
			System.out.println("Selecione uma categoria de fita:");
			System.out.println("1. Fita comum");
			System.out.println("2. Fita lançamento");
			System.out.println("3. Fita infantil");
			controlador = leitor.nextInt();
			switch (controlador) {
				case 1:
					System.out.println(" O filme de nome: " + getTitulo() + "  pertence a categoria comum e possui um valor fixo de locação de R$: " + getPrecoFixo());
					return precoFixo;
				case 2:
					System.out.println(" O filme de nome: " + getTitulo() + "  pertence a categoria lançamentos e possui um valor fixo de locação de R$: " + getFitaLancamento());
					return fitaLancamento;
				case 3:
					System.out.println(" O filme de nome: " + getTitulo() + "  pertence a categoria fitas infantis e possui um valor fixo de locação de R$: " + getFitaInfantil());
					return fitaInfantil;
				default:
					System.out.println("Valor invalido");
					break;
				}
				return controlador;
	}
}
