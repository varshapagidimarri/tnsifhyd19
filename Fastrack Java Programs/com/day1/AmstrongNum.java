package com.day1;

import java.util.Scanner;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();
		int originalNum,rem,result=0,n=0;
		originalNum=num;
		while(originalNum!=0) {
			originalNum/=10;
			++n;
		}
		originalNum=num;
		while(originalNum!=0) {
			rem=originalNum%10;
			result+=Math.pow(rem,n);
			originalNum/=10;
		}
         if(result==num) {
        	 System.out.println("amstrong number");
         }
         else {
        	 System.out.println("not an amstrong number");
         }
	}

}
