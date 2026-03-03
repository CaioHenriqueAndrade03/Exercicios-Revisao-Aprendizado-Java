package entities;

import model.enums.AccountErrorCode;
import model.exceptions.AccountException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) throws AccountException {
		if (amount <= 0) {
			throw new AccountException(AccountErrorCode.INVALID_DEPOSIT,"Amount must be a positive value");
		}
		this.balance += amount;
	}

	public void withdraw(Double amount) throws AccountException {
		if (amount > withdrawLimit) {
			throw new AccountException(AccountErrorCode.WITHDRAW_LIMIT_EXCEEDED, "Withdraw amount exceeds limit");
		}
		if (amount > getBalance()) {
			throw new AccountException(AccountErrorCode.INSUFFICIENT_BALANCE, "Not enough balance");
		}

		balance -= amount;
	}

}
