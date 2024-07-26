package com.day2morning;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6; // Binary: 00000101
        int b = 3; // Binary: 00000011
        int result = a & b; // Binary: 00000001
        System.out.println(result);
        
        int result1 = a | b; // Binary: 00000111
        System.out.println(result1); // Output: 7
       
        int result2 = a ^ b; // Binary: 00000110
        System.out.println(result2); // Output: 6

	}

}
