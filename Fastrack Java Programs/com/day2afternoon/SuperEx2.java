package com.day2afternoon;

class Animal {
	void eat() {
		System.out.println("eating");			
}
}
	class Cat extends Animal{
	void eat() {
			System.out.println("eating slowly");
		}
	void sleep() {
		System.out.println("sleeping"); 
	}
	 void task() {
		super.eat();
		sleep();
	}
	}
 class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat c= new Cat();
        c.task();
	}

}

