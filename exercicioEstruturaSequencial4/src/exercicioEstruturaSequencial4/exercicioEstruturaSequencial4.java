package exercicioEstruturaSequencial4;

import java.util.Scanner;

public class exercicioEstruturaSequencial4 {
	public static void main(String[] args) {
		int numeroId;
		double salario, horasTrabalhadas, valorHora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu numero de matricula:");
		numeroId = sc.nextInt();
		
		System.out.println("Digite o valor da sua hora:");
		valorHora = sc.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas");
		horasTrabalhadas = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		System.out.println("Funcionario de matricula: "+numeroId);
		System.out.printf("Seu salario esse mês será de: R$1%.2f%n ", salario);
	}
}
