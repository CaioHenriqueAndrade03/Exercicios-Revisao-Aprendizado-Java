package application;

import java.util.Scanner;

import entities.Account;
import model.exceptions.AccountException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da conta: ");
		Integer number = sc.nextInt();

		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Digite o saldo da conta: ");
		Double balance = sc.nextDouble();

		System.out.println("Digite o limite de saque: ");
		Double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		try {
			System.out.println("O que voce quer fazer: ");
			System.out.println("1 - Ver saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Verificar limite de saque");
			System.out.println("4 - Ajustar limite de saque");
			System.out.println("5 - Ver titular da conta");
			System.out.println("6 - Ver numero da conta");
			System.out.println("7 - Depositar");

			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("Seu saldo atual é: " + account.getBalance());
				break;
			case 2:
				System.out.println("Quanto deseja sacar: ");
				double amount = sc.nextDouble();
				account.withdraw(amount);
				System.out.println("Novo saldo: " + account.getBalance());
				break;
			case 3:
				System.out.println("O seu limite de saque é: " + account.getWithdrawLimit());
				break;
			case 4:
				System.out.println("Qual o novo limite de saque: ");
				amount = sc.nextDouble();
				account.setWithdrawLimit(amount);
				break;
			case 5:
				System.out.println("O nome do titular da conta é: " + account.getHolder());
				break;
			case 6:
				System.out.println("O numero da conta é: " + account.getNumber());
				break;
			case 7:
				System.out.println("Quanto deseja depositar: ");
				amount = sc.nextDouble();
				account.deposit(amount);
				System.out.println("Seu saldo atual é de " + account.getBalance());
				break;
			default:
				System.out.println("Voce escolheu uma opção invalida");
				break;
			}
			sc.close();

		} 
		catch (AccountException e) {

		    switch (e.getCode()) {

		        case INSUFFICIENT_BALANCE:
		            System.out.println("Erro: saldo insuficiente");
		            break;

		        case WITHDRAW_LIMIT_EXCEEDED:
		            System.out.println("Erro: limite de saque excedido");
		            break;

		        case INVALID_DEPOSIT:
		            System.out.println("Erro: valor de depósito inválido");
		            break;

		        default:
		            System.out.println("Erro: " + e.getMessage());
		    } 
		}
	}

}
