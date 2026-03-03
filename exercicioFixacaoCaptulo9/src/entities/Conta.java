package entities;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0;
	}
	
	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(saldo);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Updated balance: "+ saldo);
	}
	
	public void sacar(double deposito) {
		this.saldo = (saldo - deposito) - 5;
		System.out.println("Updated balance: "+ saldo);
	}
	

}
