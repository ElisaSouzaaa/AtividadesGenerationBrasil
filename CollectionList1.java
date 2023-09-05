package atividades;

import java.util.Scanner;
import java.util.ArrayList;

public class CollectionList1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		
		for( int indice = 0; indice <5; indice++) {
			System.out.println("Digite o nome de uma cor: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("\nAs cores digitadas são: " + cores.toString());
		cores.sort(null);
		System.out.println("\nAs cores em ordem crescente: " + cores);
		
		leia.close();

	}

}
