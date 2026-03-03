package exercicioEstruturaFor5;

import java.util.Scanner;

public class exercicioEstruturaFor5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int resultado = 1;
		
		for(int i = 1; i<=N; i++) {
			resultado *=i;
		}
		sc.close();
		System.out.println(resultado);
	}
}
