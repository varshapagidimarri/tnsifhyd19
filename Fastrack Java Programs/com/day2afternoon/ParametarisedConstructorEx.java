package com.day2afternoon;

public class ParametarisedConstructorEx {
	private String aptitude="clear";
	private String technical="pass";
	private  String hrround="done";
	private int salary=50000;
	
	ParametarisedConstructorEx(String aptitude,String technical,String hrround,int salary) {
		  this.aptitude=aptitude;
		 this.technical=technical;
		 this.hrround=hrround;
		 this.salary=salary;
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
