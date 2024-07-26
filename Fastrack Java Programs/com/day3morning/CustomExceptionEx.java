package com.day3morning;


	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class CustomExceptionEx {
		 static void checkAge(int age) throws InvalidAgeException {
		        if (age < 18) {
		            throw new InvalidAgeException("Age must be greater than or equal to 18");
		        }
		        System.out.println("You are eligible");
		    
	    }
	    public static void main(String[] args) {
	    	
	        int age = 15;
	        try {
	            checkAge(age);
	        } catch (InvalidAgeException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	       

	   
	}


