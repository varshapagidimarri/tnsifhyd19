package com.day1;

import java.util.Scanner;

public class Avgof2Nums {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter first number:");
		double n1= sc.nextDouble();
		System.out.print("enter second number:");
		double n2=sc.nextDouble();
		double avg=(n1+n2)/2;
		System.out.println("the average of given 2 numbers is "+avg);
		
	}

}
