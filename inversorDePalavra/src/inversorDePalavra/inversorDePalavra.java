package inversorDePalavra;

import java.util.Scanner;

public class inversorDePalavra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		palavra = sc.nextLine();
		
		for(int i=palavra.length()-1;i>=0;i--) {
			System.out.printf("%c",palavra.charAt(i));
		}
		
	}

}
