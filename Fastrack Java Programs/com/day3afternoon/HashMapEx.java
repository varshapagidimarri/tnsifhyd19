package com.day3afternoon;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> h=new HashMap<Integer,String>();
       h.put(1, "one");
       h.put(2, "two");
       h.put(3, "three");
       System.out.println(h);
      System.out.println(h.get(1)); 
      for (Map.Entry<Integer, String> e : h.entrySet())
          System.out.println(e.getKey() + " " + e.getValue());
  
       
	}

}
