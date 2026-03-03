package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ordem da matriz:");

		int n = sc.nextInt();
		int[][] tabela = new int[n][n];
		List<Integer> negativos = new ArrayList<>();

		System.out.println("Digite os numeros da matriz:");
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				tabela[i][j] = sc.nextInt();
				if (tabela[i][j] < 0) {
					negativos.add(tabela[i][j]);
				}
			}
		}

		System.out.println("Matriz:");
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				System.out.printf("%3d ", tabela[i][j]);
			}
			System.out.println();
		}

		System.out.println("Diagonal principal:");
		for (int i = 0; i < tabela.length; i++) {
			System.out.printf("%3d ", tabela[i][i]);
		}

		System.out.println();
		System.out.println();
		
		System.out.println("Negativos:");
		System.out.println("Quantidade de negativos: " + negativos.size());
		for (Integer negativo : negativos) {
			System.out.printf("%3d ", negativo);
		}
		sc.close();

	}
}
