package atividades;
import java.util.Scanner;

public class VariaveisOperadores4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		Float n1, n2, n3, n4, diferenca;
		
		System.out.printf("Digite o primeiro valor numérico: ");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite o segundo valor numérico: ");
		n2 = leia.nextFloat();
		
		System.out.printf("Digite o terceiro valor numérico: ");
		n3 = leia.nextFloat();
		
		System.out.printf("Digite o quarto valor numérico: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\n"+ "O primeiro valor é: " + n1 + "\n");
		System.out.printf("O segundo valor é: " + n2 + "\n");
		System.out.printf("O terceiro valor é: " + n3 + "\n");
		System.out.printf("O quarto valor é: " + n4 + "\n");
		System.out.printf("A diferença entre os números digitados é: " + diferenca);
		

	}

}
