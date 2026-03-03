package exercicioEstruturaCondicional1;

import java.util.Scanner;

public class exercicioEstruturaCondicional1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Escreva um numero para ser verificado:");
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
	}

}
