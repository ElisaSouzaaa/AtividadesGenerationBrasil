package atividades;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valorVetor[] = {2,5,1,3,4,9,7,8,10,6};
		int num = 0;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
			
			if(num>10) {
				System.out.println("O número " + num + " não foi encontrado!");
			}else {
				for(int indice = 0; indice < 10; indice++) {
					if(num==valorVetor[indice]) {
						System.out.println("O número " + num + " está no índice " + indice);
					}
				}
			}
			
			leia.close();
		}
		
	}
