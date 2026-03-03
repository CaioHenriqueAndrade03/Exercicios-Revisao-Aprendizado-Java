package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor:");
		int n = sc.nextInt();
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int j = 0; j < vetorB.length; j++) {
			vetorB[j] = sc.nextInt();
		}

		System.out.println("Vetor resultante:");
		for (int k = 0; k < vetorC.length; k++) {
			vetorC[k] = vetorA[k] + vetorB[k];
			System.out.println(vetorC[k]);
		}
		sc.close();
	}

}
