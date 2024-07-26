package com.day2morning;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
        boolean b = false;

        // AND operator
        boolean result1 = a && b;
        System.out.println("a && b: " + result1); // Output: false

        // OR operator
        boolean result2 = a || b;
        System.out.println("a || b: " + result2); // Output: true

        // NOT operator
        boolean result3 = !a;
        System.out.println("!a: " + result3); // Output: false
        
        int x = 10;
        int y = 5;

        if (x > 5 && y < 10) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }

	}

}
