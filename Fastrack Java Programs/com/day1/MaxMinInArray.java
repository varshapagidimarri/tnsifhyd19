package com.day1;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter number of elements :");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
         System.out.println("max is "+max);
         System.out.println("min is "+min);
	}
}
