package edu.stpeters;

public class BankException {

	public static void main(String[] args) {
		
		SBIBank sbi = new SBIBank(5000);
		
		sbi.withDraw(10000);
		sbi.withDraw(7000);
		sbi.withDraw(1000);
		
		
	}

}
