package com.day1;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a string:");
		String s= sc.nextLine();
		String reversedStr="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedStr+=s.charAt(i);
		}
		System.out.println(reversedStr);

	}

}
