package br.com.generation.Ex.Aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		double num1, num2, num3;
		
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = entrada.nextDouble();
		
		if (num1<num2 && num1<num3) {
		if(num2<num3) {
		System.out.println("Sequ�ncia crescente �: "+num1+" "+num2+" "+num3);}
		if(num2>num3){
		System.out.println("Sequ�ncia crescente �: "+num1+" "+num3+" "+num2);}
        }
		if(num2<num1 && num2<num3) {
		if(num1<num3) {
		System.out.println("Sequ�ncia crescente �: "+num2+" "+num1+" "+num3);}
		if(num1>num3){
		System.out.println("Sequ�ncia crescente �: "+num2+" "+num3+" "+num1);}
	    }
		if(num3<num1 && num3<num2) {
		if(num1<num2) {
	    System.out.println("Sequ�ncia crescente �: "+num3+" "+num1+" "+num2);}
	    if(num1>num2){
		System.out.println("Sequ�ncia crescente �: "+num3+" "+num2+" "+num1);}
		
		}
		}
		
	
	{
		
	}
	
}

