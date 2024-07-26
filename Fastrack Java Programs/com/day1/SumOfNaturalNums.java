package com.day1;

import java.util.Scanner;

public class SumOfNaturalNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n= sc.nextInt();
		 int sum=0;
		 for(int i=0;i<=n;i++) {
			 sum+=i;
		 }
		System.out.println("the sum of given natural numbers is:  " +sum);

	}

}
