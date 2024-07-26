package com.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int count= sc.nextInt();
		int n1=0,n2=1;
		System.out.print("Fibonacci series is:");
		for(int i=1;i<=count;++i) {
			System.out.print(n1+ " ");
			int sum= n1+n2;
			n1=n2;
			n2=sum;
	
		}

	}

}
