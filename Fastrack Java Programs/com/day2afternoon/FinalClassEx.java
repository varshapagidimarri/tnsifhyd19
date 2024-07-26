package com.day2afternoon;

final class Parent1{
	
}

 class FinalClassEx extends Parent1 {
	 void show() {
		 System.out.println("Final class cannot be extended or inherited");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClassEx p=new FinalClassEx();
		p.show();

	}

}