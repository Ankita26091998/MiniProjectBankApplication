package com.bank.app;

public class InsufficientBalanceException extends Exception {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String s) {
		super(s);
	}
}
