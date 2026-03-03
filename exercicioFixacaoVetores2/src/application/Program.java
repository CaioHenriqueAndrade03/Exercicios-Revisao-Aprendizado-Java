package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double soma=0, media=0;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		
		
		
		
	
		
		System.out.printf("Valores:" );
		for(int j=0; j<numeros.length; j++) {
			System.out.printf("%.1f ",numeros[j]);
		}
		
		for(int i = 0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		System.out.printf("%nSoma: %.2f ",soma);
		
		
		for(int j = 0; j<numeros.length; j++) {
			media = soma/numeros.length;
		}
		System.out.printf("%nMedia:  %.2f ",media);
		
		sc.close();
	}

}
