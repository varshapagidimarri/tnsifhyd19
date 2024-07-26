package com.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a string:");
		String s= sc.nextLine();
		String reversedStr="";
		for( int i=s.length()-1;i>=0;i--) {
			reversedStr+=s.charAt(i);
		}
		if(s.equals(reversedStr)) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
		

	}

}
