package exercicioEstruturaCondicional2;

import java.util.Scanner;

public class exercicioEstruturaCondicional2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite o numero a ser verificado");
		numero = sc.nextInt()
;
		if(numero%2==0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
	}

}
