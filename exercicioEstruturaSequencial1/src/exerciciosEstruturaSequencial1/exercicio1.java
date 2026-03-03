package exerciciosEstruturaSequencial1;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		float x, y;
		float soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o primeiro numero:");
		x = sc.nextFloat();
		System.out.println("Escolha o segundo numero: ");
		y = sc.nextFloat();
		
		soma = x+y;
		
		System.out.println("A soma do numero "+ x + " o numero "+ y + " é " + soma);
		sc.close();
		
		
		
	}

}
