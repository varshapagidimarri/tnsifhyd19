package com.day3morning;

public class ThrowEx {
	
	static void result(int marks) {
		if(marks<35)
			throw new ArithmeticException("Fail");
		else {
			System.out.println("pass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           result(39);
	}

}
