package exercicioEstruturaCondicional3;

import java.util.Scanner;

public class exercicioEstruturaCondicional3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		double resultado;
		
		System.out.println("Digite o valor para A:");
		A = sc.nextInt();
		
		System.out.println("Digite o valor para B:");
		B = sc.nextInt();
		
		if(A>B) {
			if(A%B == 0) {
				System.out.println("São multiplos");
			}else {
				System.out.println("Não são multiplos");
			}
		}else if(B>A) {
			if(B%A == 0) {
				System.out.println("São multiplos");
			}else {
				System.out.println("Não são multiplos");
			}
			
		}
	}
}
