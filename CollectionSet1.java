package atividades;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> usuarioValores = new HashSet<>();
		
		for(int indice = 0; indice <10; indice++) {
			System.out.println("\nDigite um valor: ");
			usuarioValores.add(leia.nextInt());
		}
		
		Iterator<Integer> iusuarioValores = usuarioValores.iterator();
		
		while(iusuarioValores.hasNext()) {
			System.out.println("\nValores digitados pelo usuário: " + iusuarioValores.next());
		}
		
		leia.close();
	}

}
