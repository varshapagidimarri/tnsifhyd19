package com.day2morning;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=(19<11)?true:false;
		System.out.println(x);
		int age=12;
		String a="eligible to vote";
		String b="not eligible to vote";
		String allowance=(age>18)?a:b;
		System.out.println(allowance);
		int y;
		y=(10==100)?1:0;
		System.out.println(y);
	}

}
