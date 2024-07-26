package com.day2afternoon;

public class GetterSetterEx {
	
	private String aptituderound;
	private String technicaltest;
	private String hrround;
	private int salary;
	public String getAptituderound() {
		return aptituderound;
	}
	public void setAptituderound(String aptituderound) {
		this.aptituderound = aptituderound;
	}
	public String getTechnicaltest() {
		return technicaltest;
	}
	public void setTechnicaltest(String technicaltest) {
		this.technicaltest = technicaltest;
	}
	public String getHrround() {
		return hrround;
	}
	public void setHrround(String hrround) {
		this.hrround = hrround;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	String job() {
		if(aptituderound.equals("clear") && technicaltest.equals("pass")  && hrround.equals("done") && salary>0) {
			return "got a job";
		}
		else {
			return "didn't get a job";
		}
	}

}
