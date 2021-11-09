package br.com.generation.Ex.Aula02;

import java.util.Scanner;

//Faça um programa que receba 3 inteiros e diga qual é o maior. 

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		if (num1>num2 && num1>num3) {
		System.out.println("Maior valor é: "+num1);
	   }
		if (num2>num1 && num2>num3) {
		System.out.println("Maior numero é: "+num2);	
	   }
		if (num3>num1 && num3>num2) {
		System.out.println("Maior número é: "+num3);
	}
		
	}
	}
