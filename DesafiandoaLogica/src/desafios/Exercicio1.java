package desafios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*Crie um programa que tome como entrada de dados (Nome, idade) e gere um relat�rio de
  sa�da classificando a faze da vida */
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		System.out.println("Digite sua idade:");
		
		String nome = read.next();
		int idade = read.nextInt();
	
		if(idade <= 10) {
			System.out.println(nome + " � uma crian�a " + " Crian�a");
		}else if(idade <= 18) {
			System.out.println(nome +  " � um(a) " + " Jovem");
		}else if(idade <= 20) {
			System.out.println(nome +  " � um(a) " + " Adulto");
		}else if(idade <= 40) {
			System.out.println(nome +  " � de " + " Meia idade");
		}else {
			System.out.println(nome +  " � um(a) " + " Idoso(a)");
		}
		
	}

}
