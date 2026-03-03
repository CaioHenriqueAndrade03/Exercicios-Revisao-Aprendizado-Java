package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		metodo1();

		System.out.println("FIM DO PROGRAMA!");

	}

	public static void metodo1() {
		System.out.println("METODO 1 inicio");
		metodo2();
		System.out.println("METODO 2 fim");
	}

	public static void metodo2() {
		System.out.println("METODO 2 inicio");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("POSIÇÃO INVALIDA!");
		} catch (InputMismatchException e) {
			System.out.println("ERRO NO INPUT!");
			sc.close();
			System.out.println("METODO 2 fim");
		}
	}

}
