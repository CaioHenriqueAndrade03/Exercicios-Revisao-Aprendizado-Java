package model.exceptions;

public class AmountHigherThanYourBalance extends Exception {
	private static final long serialVersionUID = 1L;

	public AmountHigherThanYourBalance(String msg) {
		super(msg);
	}
}
