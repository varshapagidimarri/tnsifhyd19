package com.day3morning;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("indu ");  
		sb.append("college");//now original string is changed  
		System.out.println(sb);
		sb.insert(0,"sri ");
		System.out.println(sb);
		sb.replace(0, 3, "srii ");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println("mutable string is created using string buffer class");
	

}
}
