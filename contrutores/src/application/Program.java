package application;

import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product x, y;
		int quantidade;
		
		
		System.out.println("Enter product data:");

		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();

		x = new Product(name,price);
		y = new Product(name, price, quantity);
		
		System.out.println("Product data: name: " + x.name + " price: " + x.price + " Quantity: " + x.quantity
				+ " Total " + x.TotalValueInStock());
		System.out.println("Enter the number of products to be added in stock: ");
		quantidade = sc.nextInt();
		x.AddProducts(quantidade);

		System.out.println("Updated data: name: " + x.name + " price: " + x.price + " Quantity: " + x.quantity
				+ " Total " + x.TotalValueInStock());
		System.out.println("Enter the number of products to be removed from stock: ");

		quantidade = sc.nextInt();
		x.RemoveProducts(quantidade);
		System.out.println("Updated data: name: " + x.name + " price: " + x.price + " Quantity: " + x.quantity
				+ " Total " + x.TotalValueInStock());
		System.out.println("Product data: " + x);
		sc.close();

	}

}
