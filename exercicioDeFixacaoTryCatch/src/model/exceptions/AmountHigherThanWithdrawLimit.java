package model.exceptions;

public class AmountHigherThanWithdrawLimit extends Exception{
	private static final long serialVersionUID = 1L;

	public AmountHigherThanWithdrawLimit(String msg) {
		super(msg);
	}

}
