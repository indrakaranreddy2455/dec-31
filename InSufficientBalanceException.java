package edu.stpeters;

public class InSufficientBalanceException extends Exception {
	
	String error;

	public InSufficientBalanceException(String error) {
		super();
		this.error = error;
	}

	@Override
	public String toString() {
		return "InSufficientBalanceException [error=" + error + "]";
	}
	

}
