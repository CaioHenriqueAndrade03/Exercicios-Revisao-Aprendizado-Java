package exercicioFixacaoCaptulo9;

import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;

		int numeroConta, resposta1;
		String nome;
		double saldo, continuar = 's';
		char resposta;

		System.out.println("Qual será o nome do titular da conta: ");
		nome = sc.nextLine();
		System.out.println("Qual será o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Você deseja adicionar algum saldo inicial: s/n");
		resposta = sc.next().charAt(0);

		if (resposta == 's' || resposta == 'S') {
			System.out.println("Digite o saldo inicial: ");
			saldo = sc.nextDouble();
			conta = new Conta(numeroConta, nome, saldo);
		} else {
			saldo = 0;
			conta = new Conta(numeroConta, nome);
		}
		while (continuar != 'n' && continuar != 'N') {
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Ver saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Alterar o nome do titular da conta");
			resposta1 = sc.nextInt();

			switch (resposta1) {
			case 1:
				System.out.println("Saldo atual: " + conta.getSaldo());
				System.out.println("Gostaria de continuar: s/n");
				continuar = sc.next().charAt(0);
				break;
			case 2:
				System.out.println("Seu saldo atual é de " + conta.getSaldo() + " quanto gostaria de sacar: ");
				double saque = sc.nextDouble();
				conta.sacar(saque);
				System.out.println("Gostaria de continuar: s/n");
				continuar = sc.next().charAt(0);
				break;
			case 3:
				System.out.println("Seu saldo atual é de " + conta.getSaldo() + " quanto deseja depositar: ");
				double deposito = sc.nextDouble();
				conta.depositar(deposito);
				System.out.println("Gostaria de continuar: s/n");
				continuar = sc.next().charAt(0);
				break;
			case 4:
				System.out.println("A conta atualmente esta no nome de " + conta.getNomeTitular()
						+ " para qual nome deseja alterar: ");
				sc.nextLine();
				nome = sc.nextLine();
				conta.setNomeTitular(nome);
				System.out.println("Gostaria de continuar: s/n");
				continuar = sc.next().charAt(0);
				break;
			}
		}

		sc.close();

	}

}
