package com.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a year:");
		int y= sc.nextInt();
		boolean isLeap=(y%4==0 && y%100!=0);
		if(isLeap) {
			System.out.println(y+ " is a leap year");
		}
		else {
			System.out.println(y+" is not a leap year");
		}

	}

}
