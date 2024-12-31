package edu.stpeters;

interface Bank {
	void withDraw(int amt) throws InSufficientBalanceException;
}


public class Demo6 {
	static void m1() {
		
		System.out.println("hello1");
		System.out.println("hello2");
		try {
			if (1==1) throw new Exception("peters college Exception ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");

	}

	public static void main(String[] args) throws Exception {
		//throw throws
		
		m1();
		
	}

}
