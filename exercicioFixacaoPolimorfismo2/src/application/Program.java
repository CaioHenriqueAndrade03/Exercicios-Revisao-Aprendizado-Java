package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n;
		char resposta;
		String nome;
		Double preco, taxa;
		Date dataManufatura;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> produtos = new ArrayList<>();
		

		System.out.println("Quantos produtos serão registrados:");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome do produto:");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Digite o preço:");
			preco = sc.nextDouble();

			System.out.println("É um produto importado ou usado: N/I/U");
			resposta = sc.next().charAt(0);

			if (resposta == 'i' || resposta == 'I') {
				System.out.println("Digite o valor da taxa:");
				taxa = sc.nextDouble();
				Product p = new ImportedProduct(nome, preco, taxa);
				produtos.add(p);
			} else if (resposta == 'u' || resposta == 'U') {
				System.out.println("Digite a data de manufatura:");
				dataManufatura = sdf.parse(sc.next());
				Product p = new UsedProduct(nome, preco, dataManufatura);
				produtos.add(p);
			} else {
				Product p = new Product(nome, preco);
				produtos.add(p);
			}
		
		}
		sc.close();
		for(Product produto: produtos) {
			System.out.println(produto.priceTag());
		}
	}

}
