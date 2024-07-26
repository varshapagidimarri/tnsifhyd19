package com.day3afternoon;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> hs=new HashSet<String>();
    hs.add("college");
    hs.add("is");
    hs.add("sri indu");
    hs.add("college");
    System.out.println(hs);
    Iterator<String>itr=hs.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next()+" ");
    }
    hs.remove("is");
    System.out.println(hs);
    
    
	}

}
