package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		double taxPerDay = 0.0;
		double taxPerHour = 0.0;
		double basicPayment = 0.0;
		double tax = 0;
		long duration = 0;
		double dias = 0;

		System.out.println("Entre com os dados do aluguel: ");
		System.out.println("Modelo do carro:");
		String carro = sc.nextLine();

		System.out.println("Retirada(dd/MM/yyyy hh:mm):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

		System.out.println("Retorno(dd/MM/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.println("Entre o preço por hora: ");
		taxPerHour = sc.nextDouble();
		
		System.out.println("Entre o preço por dia: ");
		taxPerDay = sc.nextDouble();
		CarRental cr = new CarRental(start, finish, new Vehicle(carro));
		duration = cr.getDuration();
		
		if (duration <= 12) {
			basicPayment = taxPerHour * duration;
	
		} else{
			dias = Math.ceil(duration /24.00);
			basicPayment = dias*taxPerDay;
			
		}
		tax = calculoDias(basicPayment);
		
		Invoice invoice = new Invoice(basicPayment, tax);
		cr.setInvoice(invoice);
		
		System.out.println(cr.getInvoice().toString());
		

		sc.close();
	}
	
	public static double calculoDias(double basicPayment) {
		double tax;
		if (basicPayment > 100) {
			tax = basicPayment * 0.15;
		} else {
			tax = basicPayment * 0.20;
		}
		
		return tax;
	}

}
