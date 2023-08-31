package atividades;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, Soma;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		Soma = A + B;
		
		if(Soma > C) {
			System.out.println("\n" + A + "+" + B + ">" + C);
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(Soma == C){
			System.out.println("\n" + A + "+" + B + "=" + C);
			System.out.println("A Soma de A + B é Igual a C");
		}else {
			System.out.println("\n" + A + "+" + B + "<" + C);
			System.out.println("A Soma de A + B é Menor que C");
		}
		
	}

}
