package atividades;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valorMatriz[][] = new int [3][3];
		int soma1 = 0, soma2 = 0;
		
		for(int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for(int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
				System.out.println("Digite um valor para a posição [" + indiceLinha + "][" + indiceColuna + "]: ");
				valorMatriz[indiceLinha][indiceColuna] = leia.nextInt();
				
				if(indiceLinha == indiceColuna) {
					soma1 += valorMatriz[indiceLinha][indiceColuna];
				}
				
			if (indiceLinha + indiceColuna == 2) {
                    	soma2 += valorMatriz[indiceLinha][indiceColuna];
                		}
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: " + valorMatriz[0][0] + ", " + valorMatriz[1][1] + ", " + valorMatriz[2][2]);
		System.out.println("Elementos da Diagonal Secundária: " + valorMatriz[0][2] + ", " + valorMatriz[1][1] + ", " + valorMatriz[2][0]);
		System.out.println("A soma dos elementos da Diagonal Principal é: " + soma1);
		System.out.println("A soma dos elementos da Diagonal Principal é: " + soma2);
		
		leia.close();
	}
}
