package com.day2afternoon;


public class AbsrtactClsMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AbstractStudent p1 = new AbstractStudying();
          p1.about();
	      p1.study();
	      System.out.println("                         ");
	      AbstractStudent p2= new  AbstractGrauated();
	      p2.about();
	      p2.study();
	}

}
