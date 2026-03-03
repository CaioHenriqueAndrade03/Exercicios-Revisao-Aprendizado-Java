package exercicioEstruturaSequencial6;

import java.util.Scanner;

public class exercicioEstruturaSequencial6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		double pi = 3.14159;
		double Area = 0;
		
		System.out.println("Digite o valor de A:");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		C = sc.nextDouble();

		//Triangulo:
		Area = A*C/2;
		System.out.printf("Triangulo: %.3f%n", Area);
		
		//circulo
		Area = pi*(Math.pow(C, 2));
		System.out.printf("Circulo: %.3f%n", Area);
		
		//Trapezio
		Area = (A+B)/2 * C;
		System.out.printf("Trapezio: %.3f%n", Area);
		
		//Quadrado
		Area = Math.pow(B,2);
		System.out.printf("Quadrado: %.3f%n", Area);
		
		//Retangulo
		Area = A * B;
		System.out.printf("Retangulo: %.3f%n", Area);
	}

}
