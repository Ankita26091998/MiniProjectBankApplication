package com.bank.app;

public class NegativeAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmountException(String s) {
		super(s);
	}

}
