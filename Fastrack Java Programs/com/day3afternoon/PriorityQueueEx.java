package com.day3afternoon;
import java.util.*;
public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Integer> p=new PriorityQueue<Integer>();
      p.add(22);
      p.add(33);
      p.add(44);
      System.out.println(p);
      System.out.println(p.peek());//prints first entered element element
      System.out.println(p.poll());//prints and deletes first entered element fifo
      System.out.println(p.peek());
      System.out.println(p);
      
	}

}