package com.day1;

import java.util.Scanner;

public class ReveseOfNum {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("enter a number:");
	int n= sc.nextInt();
	int rev=0;
	while(n!=0) {
		int digit = n %10;
		rev=rev*10+digit;
		n/=10;
	}
	System.out.println("the reverse of the given number is "+ rev);

}
}
