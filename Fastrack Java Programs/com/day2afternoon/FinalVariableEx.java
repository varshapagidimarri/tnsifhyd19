package com.day2afternoon;

public class FinalVariableEx {
    final int score=100;
	void game() {
		 score=250;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableEx f=new FinalVariableEx();
		f.game();
         
	}

}
