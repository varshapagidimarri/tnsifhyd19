package com.day3morning;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             try {
            	 int a=25/0;
             }
             catch(ArithmeticException e) {
            	 System.out.println(e);
             }
             finally {
            	 System.out.println("finally block");
             }
	}
	

}
 