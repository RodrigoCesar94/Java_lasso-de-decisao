package br.com.generation.Ex.Aula02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
	int idade;
	
	Scanner leia = new Scanner(System.in);
  
	System.out.println("Escreva sua idade: ");
	idade = leia.nextInt();
	
    if (idade>=10 && idade <=14) {
    	System.out.println("Se encontra na categoria Infantil");
    }
    if (idade>=15 && idade <=17) {
    	System.out.println("Se encontra na categoria Juvenil");
    }
    if (idade>=18 && idade <=25) {
    	System.out.println("Se encontra na categoria Adulto");
    }
    else{System.out.println("idade fora do escopo");
    }
	
	}

}
