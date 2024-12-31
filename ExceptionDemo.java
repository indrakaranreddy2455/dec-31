package edu.stpeters;

public class ExceptionDemo {

	public static void main(String[] args) {

		int n=100,d=0;
		try {
			System.out.println(n/d);
			
		}catch(Exception a) {
			System.out.println("error occured....");
			a.printStackTrace();
			try {
				System.out.println("Nested try block....");
				System.out.println(10/0);
			}catch(Exception e1) {
				System.out.println("inside error....");
				e1.printStackTrace();
			}
			
		}
		System.out.println("Welcome");
		System.out.println("Hello");
		System.out.println("HYD");

	}
	
}
