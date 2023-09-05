package atividades;


import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaLivro = new Stack<>();
		int opt;
		
		do {
		
		System.out.println("\nDigite a opção: ");
		System.out.println("\n1- Adicionar livro na pilha" + "\n2- Listar todos os livros" + "\n3- Retirar livro da pilha" + "\n0- Sair");
		System.out.println("\n");
		opt = leia.nextInt();

			if(opt == 1) {
				System.out.println("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				pilhaLivro.push(leia.nextLine());
			}
			if(opt == 2) {
				if(pilhaLivro.isEmpty()) {
					System.out.println("\nA lista está vazia!");
				}else {
					System.out.println("\nLista dos livros: ");
					System.out.println("\nLivros da pilha: " + pilhaLivro.toString());
				}
			}
			
			if(opt == 3) {
				System.out.println("\nLivro removido com sucesso!");
				pilhaLivro.pop() ;
			}
			
			if(opt == 0) {
				System.out.println("\nPrograma Finalizado!");
			}
			
		}while(opt != 0);
		
		leia.close();
	}

	}
