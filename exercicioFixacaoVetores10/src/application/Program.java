package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		sc.nextLine();
		Aluno[] alunos = new Aluno[n];

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			System.out.println("Digite a nota 1:");
			double n1 = sc.nextDouble();
			
			System.out.println("Digite a nota 2:");
			double n2 = sc.nextDouble();
			sc.nextLine();

			alunos[i] = new Aluno(nome, n1, n2);
			}
		System.out.println("Alunos aprovados:");
		for(int j = 0; j<alunos.length; j++) {
			if(alunos[j].media()>=6) {
				System.out.println(alunos[j].getName());				
			}
		}
		sc.close();
	}

}
