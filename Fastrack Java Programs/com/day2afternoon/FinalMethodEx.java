package com.day2afternoon;

class Parent{
	final void display() {
		System.out.println("final method");
	}
}

class FinalMethodEx extends Parent {
	void display() {
		System.out.println("final method cannot be over ridden");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethodEx obj=new FinalMethodEx();
		obj.display();

	}

}
