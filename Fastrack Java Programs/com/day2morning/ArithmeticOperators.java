package com.day2morning;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    double x = sc.nextDouble();
	    System.out.println("enter another number:");
	    double y=sc.nextDouble();
	    double add=x+y;
	    double sub=x-y;
	    double mult=x*y;
	    double div=x/y;
	    double mod=x%y;
	    double preinc=++x;
	    double postinc=y++;
	    double predec=--x;
	    double postdec=y--;
	    System.out.println("addition: "+add);
	    System.out.println("subtraction: "+sub);
	    System.out.println("multiplication: "+mult);
	    System.out.println("division: "+div);
	    System.out.println("modulus: "+mod);
	    System.out.println("preincrement of x is: " +preinc);
	    System.out.println("postincrement of y is: "+postinc);
	    System.out.println("predecrement of x is: "+predec);
	    System.out.println("post decerement of y is: "+postdec);
	    

	}

}
