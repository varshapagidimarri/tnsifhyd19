package com.day3afternoon;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		for(int i=1;i<=20;i+=2) {
			l.add(i);
		}
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}

	}

}
