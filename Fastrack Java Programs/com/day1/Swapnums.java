package com.day1;

import java.util.Scanner;

public class Swapnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n1= sc.nextInt();
		System.out.print("enter another number");
		int n2= sc.nextInt();
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swapping");
		System.out.println("first number is "+n1);
		System.out.println("second number is " +n2);

	}

}
