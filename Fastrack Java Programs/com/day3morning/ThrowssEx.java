package com.day3morning;


public class ThrowssEx {
	static void result(int marks) throws ArithmeticException  {
		if(marks<35)
			throw new ArithmeticException("Fail");
		else {
			System.out.println("pass");
		}
	}
	
	void  method() {
	
	 try {
         result(100);
     } 
	 catch (ArithmeticException e) {
         System.out.println(e);
     }
	}

    public static void main(String[] args) {
       ThrowssEx t=new ThrowssEx();
       t.method();
    }
	

	

}
