package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int quantidade = 0;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Numeros pares:");
		for(int j = 0; j<numeros.length; j++) {
			if(numeros[j] % 2 == 0) {
				System.out.printf("%d ",numeros[j]);
				quantidade +=1;
			}
		}
		sc.close();
		System.out.printf("%n");
		System.out.println("Quandidade de pares: "+ quantidade);
		
	}
}
