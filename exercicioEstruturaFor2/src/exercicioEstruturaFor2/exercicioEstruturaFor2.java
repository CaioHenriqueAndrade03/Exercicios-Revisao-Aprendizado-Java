package exercicioEstruturaFor2;

import java.util.Scanner;

public class exercicioEstruturaFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,NUMERO,dentro,fora;
		dentro = 0;
		fora = 0;
		N = sc.nextInt();
		for(int i=0;i<=N-1;i++) {
			NUMERO = sc.nextInt();
			if(NUMERO < 10 || NUMERO > 20) {
				fora++;
			}else {
				dentro++;
			}
		}System.out.println("Tivemos numeros dentro: " + dentro + " e numeros fora:" + fora);
	}

}
