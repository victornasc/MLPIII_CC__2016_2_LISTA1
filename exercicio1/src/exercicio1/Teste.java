package exercicio1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		Scanner leitor = new Scanner(System.in);
		
		String numero;
		String descricao;
		int quantidadeItem;
		double precoItem;
		
		System.out.println("Digite o numero do item: ");
		numero = leitor.nextLine();
		fatura.setNumero(numero);
		
		System.out.println("Digite a descrição do item: \n");
		descricao = leitor.nextLine();
		fatura.setDescricao(descricao);
		
		System.out.println("Digite a quantidade de itens: ");
		quantidadeItem = leitor.nextInt();
		fatura.setQuantidadeItem(quantidadeItem);
		
		System.out.println("Digite o preço do item: ");
		precoItem = leitor.nextDouble();
		fatura.setPrecoItem(precoItem);
		
		
		System.out.println("O valor da fatura é: " + fatura.getValorFatura());
	}
}
