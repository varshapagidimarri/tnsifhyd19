package com.day3morning;

public class WrapperAutoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		double b=2.5;
		Integer aObj=Integer.valueOf(a);
		Double bObj=Double.valueOf(b);
		if(aObj instanceof Integer) {
			System.out.println("object is created for integer a");
		}
		if(bObj instanceof Double) {
			System.out.println("object is created for double b");
		}
          System.out.println("autoboxing is done by converting primitive type to object representation");
       
	}

}
