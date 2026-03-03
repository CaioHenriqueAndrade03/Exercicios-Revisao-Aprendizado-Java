package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		int[] numeros = new int[n];

		for(int i = 0; i<numeros.length;i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos:");
		for(int j = 0; j<numeros.length; j++) {
			if(numeros[j] < 0) {
				System.out.println(numeros[j]);
			}
		}
		sc.close();
		
		
	}
}
