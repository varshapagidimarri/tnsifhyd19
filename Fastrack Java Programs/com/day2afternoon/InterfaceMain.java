package com.day2afternoon;
import com.day2afternoon.InterfaceEmpEx;
import com.day2afternoon.InterfacePremanent;
import com.day2afternoon.InterfaceParttime;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEmpEx emp1 = new InterfaceParttime();
		System.out.println( emp1.experience());
		System.out.println( emp1.location());
		System.out.println(emp1.salary());
		
	    InterfaceEmpEx emp2 = new InterfacePremanent();
		System.out.println(emp2.experience());
		System.out.println(emp2.location());
		System.out.println(emp2.salary());
		
	}

}
