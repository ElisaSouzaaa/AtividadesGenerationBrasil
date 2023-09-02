package atividades;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		int numero = 0, result = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero > 0) {
				result = result + numero;
			}
			
				
		}while(numero != 0);
		
		System.out.println("A soma dos números positivos é: " + result);
	}
}

