package exericio2OrientacaoAObjeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		double percent = 0;
		
		System.out.println("Name: ");
		x.name = sc.nextLine();
		System.out.println("Gross salary: ");
		x.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		x.Tax = sc.nextDouble();
		
		x.NetSalary();
		System.out.println(x);
		System.out.println("Wich percentage to incrase salary? ");
		percent = sc.nextDouble();
		x.IncreaseSalary(percent);
		
		System.out.println("Updated data: "+ x);
		sc.close();

	}

}
