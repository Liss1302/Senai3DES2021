package desafios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia o nome e a idade de algumas pessoas e acrescente um ano a suas vidas.*/
		
		Scanner read = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String name = read.next();
		System.out.println("Digite sua idade: ");
		float idade = read.nextInt();
		
		float soma = idade + 1;
		
		System.out.println("Olá " + name + " sua idade somada a + 1 é " + soma + " anos");
		
		
	}

}
