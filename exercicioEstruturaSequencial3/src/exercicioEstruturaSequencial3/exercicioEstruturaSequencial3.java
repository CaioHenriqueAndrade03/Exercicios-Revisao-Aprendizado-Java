package exercicioEstruturaSequencial3;

import java.util.Scanner;

public class exercicioEstruturaSequencial3 {
	public static void main(String[] args) {
		int A, B, C, D;
		int diferenca;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para A:");
		A = sc.nextInt();

		System.out.println("Digite um valor para B:");
		B = sc.nextInt();

		System.out.println("Digite um valor para C:");
		C = sc.nextInt();

		System.out.println("Digite um valor para D:");
		D = sc.nextInt();

		diferenca = A * B - C * D;
		System.out.println("A diferença foi: " + diferenca);
		sc.close();
	}

}
