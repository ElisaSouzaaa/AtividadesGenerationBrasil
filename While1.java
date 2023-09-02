package atividades;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		int idade = 0, totalMenor = 0, totalMaior = 0;
		
		while(idade >= 0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade > 50) {
				totalMaior++;
			}else if(idade < 21){
				if(idade > 0) {
					totalMenor++;
				}
			}
			
		}
		
		System.out.println("A quantidade de pessoas menores de 21 anos é de: " + totalMenor);
		System.out.println("A quantidade de pessoas maiores de 50 anos é de: " + totalMaior);
	}
}

