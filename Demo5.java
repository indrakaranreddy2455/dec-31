package edu.stpeters;

public class Demo5 {

	public static void main(String[] args) {
		
		
		
		System.out.println("hello1");
		System.out.println("hello2");
		try {
			if(1==1) throw new ArithmeticException("peters college exception");
			
		}catch(ArithmeticException e) {
			System.out.println("error occured--->");
			
		}
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");
	}

}
