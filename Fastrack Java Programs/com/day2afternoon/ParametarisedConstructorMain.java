package com.day2afternoon;

public class ParametarisedConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametarisedConstructorEx p= new ParametarisedConstructorEx("clear","pass","done",50000);
		ParametarisedConstructorEx p1= new ParametarisedConstructorEx("clear","fail","-",0);
		System.out.println(p.job());
		System.out.println(p1.job());
	}

}
