package com.day1;

import java.util.Scanner;

public class LargestOf3nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter first number:");
		int n1= sc.nextInt();
		System.out.print("ente second number:");
		int n2=sc.nextInt();
		System.out.print("enter third number:");
		int n3=sc.nextInt();
		int l;
		if(n1>=n2 && n1>=n3) {
			l=n1;
		}
		else if(n2>=n1 && n2>=n3) {
			l=n2;
		}
		else {
			l=n3;
		}
		System.out.println("the largest among the given numbers is " +l);
			
		
	}

}
