package usoDoFor;

import java.util.Scanner;

public class usoDoFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n1 = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<n1; i++) {
			int x = sc.nextInt();
			soma = soma +x;
		}
		sc.close();
		System.out.println("O resultado foi :"+ soma);
		
		
	}

}
