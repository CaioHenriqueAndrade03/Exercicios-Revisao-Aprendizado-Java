package exercicioEstruturaFor3;

import java.util.Scanner;

public class exercicioEstruturaFor3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double N1,N2,N3,resultado;
		
		for(int i=0; i<N;i++) {
			N1 = sc.nextDouble();
			N2 = sc.nextDouble();
			N3 = sc.nextDouble();
			resultado= ((N1*2)+(N2*3)+(N3*5))/10;
			System.out.printf("%.1f%n",resultado);
		}
		sc.close();
	}
}
