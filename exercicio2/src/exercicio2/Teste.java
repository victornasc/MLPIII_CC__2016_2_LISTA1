package exercicio2;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Scanner leitor = new Scanner(System.in);
		
		String modelo, cor;
		int opt;
		
		System.out.println("Digite o modelo do carro: ");
		modelo = leitor.nextLine();
		carro.setModelo(modelo);
		
		System.out.println("Digite a cor do carro: ");
		cor = leitor.nextLine();
		carro.setCor(cor);
		
		System.out.println("Deseja ligar o carro?");
		System.out.println("1 - sim ou 2 - n�o!");
		opt = leitor.nextInt();
		
		if (opt == 1){
			carro.ligar = true;
			carro.ligar();
			System.out.println("O modelo do veiculo �: " + carro.modelo + " e a cor do veiculo �: " + carro.cor);
			carro.acelerar();
			
		} else {
			carro.ligar = false;
			carro.ligar();
		}
		
	}

}
