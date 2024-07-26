package com.day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n= sc.nextInt();
		System.out.print("enter a range:");
		int range= sc.nextInt();
		System.out.println("the table is");
		for(int i=1;i<=range;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}

	}

}
