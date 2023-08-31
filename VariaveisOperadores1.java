package atividades;

import java.util.Scanner;

public class VariaveisOperadores1 {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		Float salario;
		Float abono;
		Float novoSalario;
		
		System.out.printf("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.printf("Digite seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu salário é: " + salario + "\n");
		System.out.printf("Seu abono é: " + abono + "\n");
		System.out.printf("Seu novo salário é: " + novoSalario + "\n");
	}
}