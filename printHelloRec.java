package edu.stpeters;

public class printHelloRec {

	public static void main(String[] args) {
		int n=5;
		//123456789
		//12345678
		//1234567
		//123456
		//12345
		//1234
		//123
		//12
		//1
		for(int r=9;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(c+" ");
			}
			System.out.println();	
	
		}
		
	}

}



