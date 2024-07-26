package com.day3morning;

public class MultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]= {{{1,11},{2,22},{3,33}},
			    {{4,44},{5,55},{6,66}},
			    {{7,77},{8,88},{9,99}}};
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			for(int k=0;k<3;k++) {
			System.out.println(a[i][j]+" ");
			}
			
			
		}
	}

	}

}
