package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> Funcionarios = new ArrayList<>();
		int n;
		char resposta;
		String nome;
		Integer hours;
		Double valuePerHours, additionalCharge;

		System.out.println("Quantos funcionarios você deseja registar:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("É um funcionario proprio ou terceiro: P/T");
			resposta = sc.next().charAt(0);
			if (resposta == 'P' || resposta == 'p') {
				System.out.println("Qual o nome do funcionario:");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.println("Quantas horas ele trabalhou:");
				hours = sc.nextInt();
				System.out.println("Qual o valor dele por hora:");
				valuePerHours = sc.nextDouble();
				Funcionarios.add(new Employee(nome, hours, valuePerHours));
			} else if (resposta == 'T' || resposta == 't') {
				System.out.println("Qual o nome do funcionario:");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.println("Quantas horas ele trabalhou:");
				hours = sc.nextInt();
				System.out.println("Qual o valor dele por hora:");
				valuePerHours = sc.nextDouble();
				System.out.println("Qual a taxa adicional:");
				additionalCharge = sc.nextDouble();
				Funcionarios.add(new OutsourcedEmployee(nome, hours, valuePerHours, additionalCharge));
			}
		}
		sc.close();

		for (Employee funcionario : Funcionarios) {
			System.out.println(funcionario.getName() + " - $ " + funcionario.payment());
		}
	}
}
