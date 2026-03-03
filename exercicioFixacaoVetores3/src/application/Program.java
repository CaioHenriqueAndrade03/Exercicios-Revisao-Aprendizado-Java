package application;

import java.util.Scanner;

import entities.Person;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas:");
		int n = sc.nextInt();
		Person[] pessoas = new Person[n];
		double alturaMedia = 0;
		double menoresDeIdade = 0;
		double porcentagem = 0;

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Digite o nome da pessoa:");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite a idade da pessoa:");
			int age = sc.nextInt();
			System.out.println("Digite a altura da pessoa:");
			double height = sc.nextDouble();

			pessoas[i] = new Person(name, age, height);
		}

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getAge() < 16) {
				menoresDeIdade += 1;
			}
			alturaMedia += pessoas[i].getHeight();
		}

		alturaMedia = alturaMedia / pessoas.length;
		porcentagem = ((menoresDeIdade / pessoas.length) * 100);

		System.out.printf("Altura média: %.2f", alturaMedia);
		System.out.println("Pessoas com menos de 16: " + porcentagem + "%");

		sc.close();

	}

}
