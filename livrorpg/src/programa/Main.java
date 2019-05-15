package programa;

import java.util.Scanner;

import textos.historia;

public class Main {

	public static void main (String [] args) {
		
		//historia texto;
		
		Scanner sc = new Scanner(System.in);
		
		historia texto1 = new historia();
		historia texto2 = new historia();
		historia texto3 = new historia();
		historia digitar = new historia();
		historia texto4 = new historia();
		historia escolha = new historia();

		
		System.out.println(texto1.inicio1);
		
		System.out.println(texto2.comeco);
		
		System.out.println(escolha.numero);
		
		digitar.digito = sc.nextInt(); // Aqui o pedido de digitar entre o numero 1 ou 2.
		
		// Caso seja digitado um numero 0, que não tem opção sera retornado a digitar denovo, até chegar ao numero com opção.
		
		while(digitar.digito == 0) {
			System.out.println("Digito não cadastrado, por favor digite um novo numero ");
			digitar.digito = sc.nextInt(); 
		}
		
		// Aqui encontramos os textos e as sequencia do jogo.
		
		if(digitar.digito == 1) {
			System.out.println(texto3.direita1);
		} else {
			System.out.println(texto4.esquerda1);
		}
		
		
	
		sc.close();
	}
	
}
