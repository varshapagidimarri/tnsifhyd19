package com.day3morning;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','r','i',' ','i','n','d','u'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("tnsif");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3); 
		s1=s1.concat("program");
		System.out.println(s1);
		System.out.println("immutable when  created using String class");
	}

}
