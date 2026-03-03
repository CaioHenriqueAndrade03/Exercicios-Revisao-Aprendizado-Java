package exercicioEstruturaCondicional4;

import java.util.Scanner;

public class exercicioEstruturaCondicional4 {
	public static void main(String[] args) {
		int horaInicial, horaFinal, tempoTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial:");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final:");
		horaFinal = sc.nextInt();
		
		if(horaInicial< horaFinal) {
			tempoTotal = horaFinal - horaInicial;
			System.out.println("O jogo durou "+ tempoTotal+ " horas");
		}else if(horaInicial>horaFinal) {
			tempoTotal= (24 - horaInicial)+horaFinal;
			System.out.println("O jogo durou "+ tempoTotal+ " horas");
		}else {
			System.out.println("O jogo durou 24 horas");
		}
	}
}
