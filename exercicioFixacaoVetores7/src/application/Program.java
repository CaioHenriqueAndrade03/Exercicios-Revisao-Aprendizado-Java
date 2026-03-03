package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor:");

		int n = sc.nextInt();
		double[] numeros = new double[n];
		double media = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			media += numeros[i];
		}
		media /= numeros.length;
		System.out.println("Media do vetor: " + media);
		System.out.println("Elementos a baixo da media:");
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] < media) {
				System.out.println(numeros[j]);
			}
		}
		sc.close();
	}
}
