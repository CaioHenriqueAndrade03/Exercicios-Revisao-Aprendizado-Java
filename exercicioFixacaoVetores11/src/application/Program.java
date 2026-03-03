package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas:");
		int n = sc.nextInt();
		double mediaFeminina = 0;
		double contadorMasc = 0;
		double mediadorFem = 0;
		double menorAltura = 5;
		double maiorAltura = 0;

		Pessoa[] pessoas = new Pessoa[n];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Altura da pessoa:");
			double altura = sc.nextDouble();

			System.out.println("Genero da pessoa:");
			char genero = sc.next().charAt(0);

			pessoas[i] = new Pessoa(altura, genero);
			if (pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			}
			if (pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
			if (pessoas[i].getGenero() == 'M') {
				contadorMasc += 1;
			} else if (pessoas[i].getGenero() == 'F') {
				mediaFeminina += pessoas[i].getAltura();
				mediadorFem += 1;
			}
		}
		mediaFeminina = mediaFeminina / mediadorFem;
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaFeminina);
		System.out.println("Quantidade de homens: " + contadorMasc);
		sc.close();
	}

}
