package com.day3afternoon;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		for(int i=1;i<=20;i+=2) {
			v.add(i);
		}
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}

	}

}
