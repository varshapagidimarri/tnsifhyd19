package com.day3afternoon;
import java.util.*;
public class DeQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> d = new ArrayDeque<Integer>(10);
    d.add(10);
    d.add(20);
    d.add(30);
    d.add(40);
    d.add(50);
    System.out.println(d);
    d.clear();
    System.out.println(d);
    d.addFirst(14);
    d.addFirst(10);
    d.addLast(11);
    d.addLast(22);

    System.out.println(d);


	}

}
