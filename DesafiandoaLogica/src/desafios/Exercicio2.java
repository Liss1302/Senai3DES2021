package desafios;

import java.util.Scanner;

public class Exercicio2 {

	/*Desenvolva um programa que receba como entrada (Nome, Peso, Altura) e classifique a saída conforme pedido
	 * O IMC é calculado dividindo o peso pela altura elevada ao quadrado. Ou seja, de forma mais simples, 
	 * você multiplica sua altura por ela mesma e depois divide seu peso pelo resultado da última conta.*/
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		System.out.println("Digite seu peso: ");
		System.out.println("Digite sua altura: ");
		
		/*double peso = Double.parseDouble(read.nextLine());
		double altura = Double.parseDouble(read.nextLine());
		double imc = (peso)/(altura * altura);*/
		
		String nome = read.next();
		float  peso = read.nextFloat();
		float  altura = read.nextFloat();
		float imc = (peso)/(altura * altura);
				 
		if(imc < 19) {
			System.out.println("Olá, " + nome + " seu imc é " + imc + " e Voce é " + "Fitness");
		}else if(imc < 25){
			System.out.println("Olá, " + nome + " seu imc é " + imc + " e Voce é " + "Sarado(a)");
		}else if(imc < 29){
			System.out.println("Olá, " + nome + " seu imc é " + imc + " e Voce é " + "Fofinho(a)");
		}else if(imc < 34) {
			System.out.println("Olá, " + nome + " seu imc é " + imc + " e Voce é " + "A coisa ta ficando feia, Bora fazer uma dieta!");
		}else {
			System.out.println("Olá, " + nome + " seu imc é " + imc + " e Voce é " + "Pé na cova!");
		}
	}

}
