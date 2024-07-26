package com.day1;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a string:");
		String s1= sc.nextLine();	
        System.out.print("enter another string:");
		String s2= sc.nextLine();
		 String c=s1+s2;
		 System.out.println("the concatenated string is: " +c);

	}

}
