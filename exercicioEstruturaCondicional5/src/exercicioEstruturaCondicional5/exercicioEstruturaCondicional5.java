package exercicioEstruturaCondicional5;

import java.util.Scanner;

public class exercicioEstruturaCondicional5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigoItem, quantidade;
		double valorUnitario, valor;

		System.out.println("Digite o codigo do item que voce quer:");
		codigoItem = sc.nextInt();

		if (codigoItem > 5 || codigoItem < 1) {
			System.out.println("Codigo invalido");
		} else if (codigoItem == 1) {
			valorUnitario = 4;
			System.out.println("Quantos voce quer?");
			quantidade = sc.nextInt();

			valor = quantidade * valorUnitario;
			System.out.printf("Total: %.2f%n", valor);
		} else if (codigoItem == 2) {
			valorUnitario = 4.5;
			System.out.println("Quantos voce quer?");
			quantidade = sc.nextInt();

			valor = quantidade * valorUnitario;
			System.out.printf("Total: %.2f%n", valor);
		} else if (codigoItem == 3) {
			valorUnitario = 5;
			System.out.println("Quantos voce quer?");
			quantidade = sc.nextInt();

			valor = quantidade * valorUnitario;
			System.out.printf("Total: %.2f%n", valor);
		} else if (codigoItem == 4) {
			valorUnitario = 2;
			System.out.println("Quantos voce quer?");
			quantidade = sc.nextInt();

			valor = quantidade * valorUnitario;
			System.out.printf("Total: %.2f%n", valor);
		} else if (codigoItem == 5) {
			valorUnitario = 1.5;
			System.out.println("Quantos voce quer?");
			quantidade = sc.nextInt();

			valor = quantidade * valorUnitario;
			System.out.printf("Total: %.2f%n", valor);
		}
	}
}
