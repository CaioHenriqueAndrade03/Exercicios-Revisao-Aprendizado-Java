package model.exceptions;

import model.enums.AccountErrorCode;

public class AccountException extends Exception {
	private static final long serialVersionUID = 1L;
	private AccountErrorCode code;

	public AccountException(AccountErrorCode code, String msg ) {
		super(msg);
		this.code = code;
	}
	
	public AccountErrorCode getCode() {
		return code;
	}
}
