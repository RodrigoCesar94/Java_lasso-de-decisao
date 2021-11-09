package br.com.generation.Ex.Aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		double num1, num2, num3;
		
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextDouble();
		
		if (num1<num2 && num1<num3) {
		if(num2<num3) {
		System.out.println("Sequência crescente é: "+num1+" "+num2+" "+num3);}
		if(num2>num3){
		System.out.println("Sequência crescente é: "+num1+" "+num3+" "+num2);}
        }
		if(num2<num1 && num2<num3) {
		if(num1<num3) {
		System.out.println("Sequência crescente é: "+num2+" "+num1+" "+num3);}
		if(num1>num3){
		System.out.println("Sequência crescente é: "+num2+" "+num3+" "+num1);}
	    }
		if(num3<num1 && num3<num2) {
		if(num1<num2) {
	    System.out.println("Sequência crescente é: "+num3+" "+num1+" "+num2);}
	    if(num1>num2){
		System.out.println("Sequência crescente é: "+num3+" "+num2+" "+num1);}
		
		}
		}
		
	
	{
		
	}
	
}

