package usoDoScanner;
import java.util.Scanner;

public class usoDoScanner {
	public static void main(String[] args) {
		String x, y, z;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui:");
		n = sc.nextInt();
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		System.out.println("VOCE DIGITOU NA LINHA N "+ n);
		System.out.println("VOCE DIGITOU NA LINHA X "+ x);
		System.out.println("VOCE DIGITOU NA LINHA Y "+ y);
		System.out.println("VOCE DIGITOU NA LINHA Z "+ z);
		sc.close();
	}
}