package com.day1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n= sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("factoril of "+ n +" is "+ fact);

	}

}