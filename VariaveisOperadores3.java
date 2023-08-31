package atividades;

import java.util.Scanner;

public class VariaveisOperadores3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		Float salarioBruto, adicionalNoturno, horasExtras, desconto, salarioLiquido;
		
		System.out.printf("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("Digite o desconto a ser aplicado: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - desconto;
		
		System.out.printf("\n" + "Seu salário bruto é de: " + salarioBruto + "\n");
		System.out.printf("Seu adicional noturno é de: " + adicionalNoturno + "\n");
		System.out.printf("Suas horas extras são de: " + horasExtras + "\n");
		System.out.printf("O desconto aplicado é de: " + desconto + "\n");
		System.out.printf("Seu salário líquido é: " + salarioLiquido);

	}

}
