package atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> clienteFila = new LinkedList<String>();
		int opt = 0;
		
		System.out.println("Digite a opção: ");
		System.out.println("\n1- Adicionar Cliente na Fila" + "\n2- Listar todos os Clientes" + "\n3- Retirar Clientes da Fila" + "\n0- Sair");
		System.out.println("\n");
		opt = leia.nextInt();


		do {
			if(opt == 1) {
				System.out.println("\nDigite o nome do cliente: ");
				clienteFila.add(leia.next());
				System.out.println("\nDigite a opção: ");
				opt = leia.nextInt();
			}
			
			if(opt == 2) {
				if(clienteFila.isEmpty()) {
					System.out.println("\nA lista está vazia!");
					System.out.println("\nDigite a opção: ");
					opt = leia.nextInt();
				}else {
					System.out.println("\nLista dos Clientes: ");
					System.out.println("\nClientes na fila: " + clienteFila.toString());
					System.out.println("\nDigite a opção: ");
					opt = leia.nextInt();
				}
			}
			
			if(opt == 3) {
				System.out.println("\nCliente removido com sucesso!");
				clienteFila.remove();
				System.out.println("\nDigite a opção: ");
				opt = leia.nextInt();
			}
			
			if(opt == 0) {
				System.out.println("\nPrograma Finalizado!");
			}
			
		}while(opt != 0);
		
		leia.close();
	}

}
