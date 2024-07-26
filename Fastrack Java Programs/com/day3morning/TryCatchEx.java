package com.day3morning;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int a=10/0;
         }
         catch(ArithmeticException e) {
        	 System.out.println(e);
        	 System.out.println("divededby zero exception has occured");
         }
	}

}
