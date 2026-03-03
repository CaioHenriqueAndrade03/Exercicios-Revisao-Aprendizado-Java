package application;

import java.util.Scanner;

import entities.Person;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar:");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] pessoas = new Person[n];
		int maisVelho = 0;
		String pessoaMaisVelha = "";

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Nome: ");
			String name = sc.nextLine();

			System.out.println("Idade");
			int idade = sc.nextInt();
			sc.nextLine();

			pessoas[i] = new Person(name, idade);
			if (pessoas[i].getAge() > maisVelho) {
				maisVelho = pessoas[i].getAge();
				pessoaMaisVelha = pessoas[i].getName();
			}
		}
		sc.close();
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
	}

}
