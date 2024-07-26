package com.day1;

import java.util.Scanner;

public class CountAndPrintNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n= sc.nextInt();
		int count=0;
		int temp=n;
		while(temp!=0) {
			temp/=10;
			count++;
		}
      System.out.println("the number of digits of "+ n +" is "+count);
	}

}
