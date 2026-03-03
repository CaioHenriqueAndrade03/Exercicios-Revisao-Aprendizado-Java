package exercicioEstruturaSequencial5;

import java.util.Scanner;

public class exercicioEstruturaSequencial5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroDePecas1;
		double valorUnitarioPeca1, valorCompostoP1;
		
		int codigoPeca2, numeroDePecas2;
		double valorUnitarioPeca2, valorCompostoP2;
		
		double resultado;
		
		System.out.println("Digite o codigo da peça 1, numero de peças, valor unitario:");
		codigoPeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		valorCompostoP1 = numeroDePecas1*valorUnitarioPeca1;
		
		System.out.println("Digite o codigo da peça 2, numero de peças, valor unitario:");
		codigoPeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();	
		
		
		valorCompostoP2 = numeroDePecas2 * valorUnitarioPeca2;
		
		resultado = valorCompostoP1 + valorCompostoP2;
		
		System.out.printf("Valor a pagar é de: %.2f%n", resultado);
	}

}
