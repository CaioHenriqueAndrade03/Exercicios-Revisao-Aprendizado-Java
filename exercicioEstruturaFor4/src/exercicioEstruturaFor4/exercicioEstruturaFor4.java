package exercicioEstruturaFor4;

import java.util.Scanner;

public class exercicioEstruturaFor4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double numerador, denominador, resultado;
		
		for(int i = 0; i<N; i++) {
			numerador = sc.nextDouble();
			denominador = sc.nextDouble();
			if(denominador == 0) {
				System.out.println("Divisao impossivel");
				continue;
			}
			resultado = numerador/denominador;
			System.out.println(resultado);
			
		}
		sc.close();
	}

}
