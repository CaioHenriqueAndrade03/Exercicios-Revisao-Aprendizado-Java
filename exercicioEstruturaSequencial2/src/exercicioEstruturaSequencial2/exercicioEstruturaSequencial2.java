package exercicioEstruturaSequencial2;

import java.util.Scanner;

public class exercicioEstruturaSequencial2 {
	public static void main(String[] args) {
		double raio = 0;
		double pi = 3.14159;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Raio do circulo: ");
		raio = sc.nextDouble();
		sc.close();
		area = pi* (Math.pow(raio, 2));
		System.out.println("O valor da area desse circulo é: "+ area);
		
		
		
	}

}
