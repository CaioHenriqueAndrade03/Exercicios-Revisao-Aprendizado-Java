package testeClasseProduto;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product x;
		int quantidade;
		x = new Product();
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		x.name = sc.nextLine();
		System.out.println("Price: ");
		x.price = sc.nextDouble();
		System.out.println("Quantity: ");
		x.quantity = sc.nextInt();

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
