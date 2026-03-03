package exemploDeFuncao;

import java.util.Scanner;

public class exemploDeFuncao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva 3 numeros");
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int maior = max(a,b,c);
		showResult(maior);
		
		
		sc.close();
	}
	
	public static int max(int x, int y,int z) {
		int aux;
		if(x>y && x>z) {
			aux = x;
		}else if (y>z) {
			aux = y;
		}else {
			aux=z;
		}
	return aux;
	}

	public static void showResult(int value) {
		System.out.println("O valor do maior deles é "+ value );
	}

}
