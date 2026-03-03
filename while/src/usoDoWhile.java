import java.util.Scanner;

public class usoDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int resultado = 0;
		x = sc.nextInt();
		
		while(x!=0) {
			resultado+=x;
			x = sc.nextInt();
		}
		sc.close();
		System.out.println("A soma dos numeros antes de encontrar o 0 foi de: "+resultado);
		
		
	}

}
