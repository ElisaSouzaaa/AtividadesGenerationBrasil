package atividades;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int codigoProduto, quantidade, preco, valorTotal;
		
		System.out.println("Digite o códgio do produto que deseja de 1 a 6: ");
		codigoProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade do produto que deseja: ");
		quantidade = leia.nextInt();
		
		switch(codigoProduto) {
		case 1:
			preco = 10;
			valorTotal = quantidade * preco;
			System.out.println("Você escolheu " + quantidade + " Cachorro quente no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: " + "R$ " + valorTotal);
			break;
		case 2:
			preco = 15;
			valorTotal = quantidade * preco;
			System.out.println("\n" + "Você escolheu " + quantidade + " X-salada no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: " + "R$ " + valorTotal);
			break;
		case 3:
			preco = 18;
			valorTotal = quantidade * preco;
			System.out.println("\n" + "Você escolheu " + quantidade + " X-Bacon no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: " + "R$ " + valorTotal);
			break;
		case 4:
			preco = 12;
			valorTotal = quantidade * preco;
			System.out.println("\n" + "Você escolheu " + quantidade + " Bauru no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: " + "R$ " + valorTotal);
			break;
		case 5:
			preco = 8;
			valorTotal = quantidade * preco;
			System.out.println("\n" + "Você escolheu " + quantidade + " Refrigerante no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: "  + "R$ " + valorTotal);
			break;
		case 6:
			preco = 13;
			valorTotal = quantidade * preco;
			System.out.println("\n" + "Você escolheu " + quantidade + " Suco de laranja no valor de: " + "R$ " + preco);
			System.out.println("O valor total é de: " + "R$ " + valorTotal);
			break;
			
		}

	}

}
