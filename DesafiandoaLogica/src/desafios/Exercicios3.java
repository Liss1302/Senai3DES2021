package desafios;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		
		/*Desenvolva um programa que receba como entrada as dimensões dos três lados de um triangulo (A,B,C) e os classifique*/

	Scanner read = new Scanner(System.in);
				 
		System.out.println("Digite o valor da dimencao do lado do triangulo: ");
		int a = read.nextInt();
		System.out.println("Digite o valor da dimencao do lado do triangulo: ");
		int b = read.nextInt();
		System.out.println("Digite o valor da dimencao do lado do triangulo: ");
		int c = read.nextInt();

		
		if(a == b && b == c && c == a) {
			System.out.println("Equilátero");
		}else if(a != b && b != c && c != a){
			System.out.println("Escaleno");
		}else {
			System.out.println("Isósceles");
		}
		
	}

}
