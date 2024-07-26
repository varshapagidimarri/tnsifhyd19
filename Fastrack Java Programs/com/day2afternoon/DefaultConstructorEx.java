package com.day2afternoon;

public class DefaultConstructorEx {
	
		private String aptitude="clear";
		private String technical="pass";
		private  String hrround="done";
		private int salary=50000;
	 
		DefaultConstructorEx() {
				 String aptitude="clear";
				 String technical="passed";
				 String hrround="done";
				 int salary=50000;
			}
			 String job() {
				if(aptitude.equals("clear") && technical.equals("pass")  && hrround.equals("done") && salary>0) {
					return "got a job";
				}
				else {
					return "didn't get a job";
				}
			}
		}




