package exercicio3OrientacaoAObjeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno x;
		x = new Aluno();
		
		System.out.println("Qual o nome do aluno: ");
		x.Name = sc.nextLine();
		System.out.println("Qual foi a nota da avaliação 1: ");
		x.nota1 = sc.nextDouble();
		System.out.println("Qual foi a nota da avaliação 2: ");
		x.nota2 = sc.nextDouble();
		System.out.println("Qual foi a nota da avaliação 3: ");
		x.nota3 = sc.nextDouble();
		
		x.Verificar();
		
		sc.close();
	}

}
