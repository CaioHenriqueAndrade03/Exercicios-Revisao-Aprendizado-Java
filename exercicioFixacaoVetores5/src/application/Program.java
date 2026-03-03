package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double maiorValor = 0;
		int posicaoMaiorValor = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = sc.nextDouble();
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posicaoMaiorValor = i;
			}
		}
		sc.close();
		System.out.println("Maior valor = " + maiorValor);
		System.out.println("Posicao do maior valor = " + posicaoMaiorValor);
	}
}
