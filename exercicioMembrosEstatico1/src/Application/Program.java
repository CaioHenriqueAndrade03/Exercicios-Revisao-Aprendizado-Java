package Application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorDolar, dolaresComprados;
		
		System.out.println("What is the dollar price?: ");
		valorDolar = sc.nextDouble();
		
		System.out.println("How many dollar will be bought: ");
		dolaresComprados = sc.nextDouble();
		
		double resultado = CurrencyConverter.convercao(dolaresComprados, valorDolar);
		
		System.out.printf("Amount to be paid in reais: %.2f%n ", resultado);
		sc.close();
		
	}

}
