package com.day3morning;

public class WrapperUnboxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer aObj=Integer.valueOf(5);
		Double bObj=Double.valueOf(2.5);
		int a=aObj.intValue();
		double b=bObj.doubleValue();
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("unboxing is done by converting object representation to primitive types");
		

	}

}
