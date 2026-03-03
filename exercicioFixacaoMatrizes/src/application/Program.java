package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas: ");
		int m = sc.nextInt();

		System.out.println("Digite o numero de colunas: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		System.out.println("Digite o numeros que farão parte da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%3d ", matriz[i][j]);
			}
			System.out.println();
		}

		System.out.println("Digite o valor que voce quer buscar na matriz: ");
		int x = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (x == matriz[linha][coluna]) {
					System.out.println("Numero escolhido: " + x);
					if (linha > 0) {
						System.out.println("Acima: " + matriz[linha - 1][coluna]);
					} else {
						System.out.println("Acima: não existe");
					}

					if (linha < m - 1) {
						System.out.println("Abaixo: " + matriz[linha + 1][coluna]);
					} else {
						System.out.println("Abaixo: não existe");
					}

					if (coluna > 0) {
						System.out.println("Esquerda " + matriz[linha][coluna - 1]);
					} else {
						System.out.println("Esquerda: não existe");
					}

					if (coluna < n - 1) {
						System.out.println("Direita: " + matriz[linha][coluna + 1]);
					} else {
						System.out.println("Direita: não existe");
					}
				}
			}
		}
		sc.close();
	}
}