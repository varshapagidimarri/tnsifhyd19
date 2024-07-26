package com.day2morning;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5; // Binary: 00000101
        int shiftedNum = num << 2; // Shift left by 2 bits
        System.out.println("LEFT SHIFT");
        System.out.println("Original number: " + num);
        System.out.println("Shifted number: " + shiftedNum); // Output: 20 (Binary: 00010100)
        
         System.out.println("RIGHT SHIFT");
         int num1=5;
        int shiftedNum1 = num1 >> 2; // Shift right by 2 bits
         System.out.println("Original number: " + num1);
        System.out.println("Shifted number: " + shiftedNum1); 
        System.out.println("UNSIGNED RIGHT SHIFT");
        int num2=5;
        int shiftedNum2 = num2 >>> 2; // Unsigned right shift by 2 bits
         System.out.println("Original number: " + num2);
        System.out.println("Shifted number: " + shiftedNum2); 

	}

}
