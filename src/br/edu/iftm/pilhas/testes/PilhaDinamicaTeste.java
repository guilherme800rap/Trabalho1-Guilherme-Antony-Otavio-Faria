package br.edu.iftm.pilhas.testes;

import java.util.EmptyStackException;
import java.util.Scanner;

import br.edu.iftm.pilhas.ItemPilha;
import br.edu.iftm.pilhas.PilhaDinamica;

public class PilhaDinamicaTeste {

	public static void main(String[] args) {
		PilhaDinamica pilha = new PilhaDinamica(10);
		String filmeobtido;
		int valorif;

		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		try {
			int i = 100;
			while ( i !=0) {
				System.out.println("_____________________________________MENU_____________________________________________");
				System.out.println("1- Se você deseja guardar um filme \n2- Se você deseja retirar um filme \n3- Para sair");
				valorif = teclado.nextInt();
				
				if(valorif == 1) {
					System.out.println("Qual filme sera guardado na locadora ??");
					filmeobtido = teclado1.nextLine();
				
					if(pilha.estaVazia()) {
						System.out.println("Filme guardado");
						pilha.empilhar(filmeobtido);
						System.out.println(pilha.olharTopo());
					}else if(pilha.estaCheia()){
						System.out.println("A locadora está cheia..");
						pilha.desempilhar();
						System.out.println(pilha.olharTopo());
					}else {
						pilha.empilhar(filmeobtido);
						System.out.println("É possível adicionar mais filmes na locadora !");
						System.out.println(pilha.olharTopo());
					}
				}
				else if(valorif == 2 ) {
					System.out.println("filme removido");
					pilha.desempilhar();
					System.out.println(pilha.olharTopo());
					filmeobtido = teclado2.nextLine();
					
				} else if(valorif == 3) {
					System.out.println("Obrigado por frequentar nossa locadora de filmes :D ");
					break;
				}		
		}
		} catch (EmptyStackException e) {
			System.out.println("Locadora vazia !");
		}

		catch (Exception e) {
			System.out.println("Erro tratado :");
			System.out.println(e.getMessage());
		}
	}
}