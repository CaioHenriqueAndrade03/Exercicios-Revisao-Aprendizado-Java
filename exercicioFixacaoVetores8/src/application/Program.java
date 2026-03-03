package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor:");
		int n = sc.nextInt();
		int numeros[] = new int[n];
		double media = 0;
		int mediador = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				media += numeros[i];
				mediador += 1;
			}
		}
		if (media > 0) {
			media /= mediador;
			System.out.println("Media dos pares:" + media);
		} else {
			System.out.println("Nenhum numero par");
		}

		sc.close();
	}

}
