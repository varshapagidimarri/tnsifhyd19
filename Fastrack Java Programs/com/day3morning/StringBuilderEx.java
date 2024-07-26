package com.day3morning;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("indu ");  
		sb.append("college");//now original string is changed  
		System.out.println(sb);
		sb.insert(0,"sri ");
		System.out.println(sb);
		sb.replace(0, 3, "srii ");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		System.out.println("mutable string is created using string builder class");
	}

}
