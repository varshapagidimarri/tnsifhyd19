package com.day3afternoon;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s= new Stack<String>();
		s.push("sri");
		s.push("indu");
		s.push("college");
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		s.pop();
		itr=s.iterator();
		System.out.println("after pop operation");
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
	}
}
