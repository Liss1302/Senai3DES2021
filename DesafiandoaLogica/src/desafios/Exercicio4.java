package desafios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Crie um programa que receba como entrada n�meros inteiros e os classifique conforme tabela*/
		
		System.out.println("Digite um valor: ");
		Scanner valores = new Scanner(System.in);
		
		int vals [];
		int x = valores.nextInt();
		int y = valores.nextInt();
		
		for(int i=x; i <= y; i=i+1) {
			if((i%2) == 0) {
				System.out.println(i + "� par");
			}else {
				System.out.println("� �mpar");
			}
		}
		
	}

}
