package model.exceptions;

public class NegativeDeposit extends Exception{
	private static final long serialVersionUID = 1L;

	public NegativeDeposit(String msg) {
		super(msg);
	}

}
