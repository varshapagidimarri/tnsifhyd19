package com.day3afternoon;
import java.util.*;
import java.io.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=20;i+=2) {
			al.add(i);
		}
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
	}

}
