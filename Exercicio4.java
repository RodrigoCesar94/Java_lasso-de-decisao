package br.com.generation.Ex.Aula02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double num, div, raiz, pot;
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva um número qualquer: ");
	num = leia.nextDouble();
	
	if(num%2==0) {
		raiz=Math.sqrt(num);
	System.out.println("Número é par e sua raíz quadrada é: "+raiz);	
	}
	
	if(num%2!=0) {
		pot=Math.pow(num, 2);
	System.out.println("Número é impar e seu quadrado é: "+pot);	
	}

	}

}
