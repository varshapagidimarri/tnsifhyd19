package com.day3afternoon;

 interface Addition{
	 int add(int x, int y);
}
public class LambdaExpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1=(x,y)->(x+y);
		System.out.println(a1.add(19,190));
		/* Addition a1=(x,y)->{
		sop(a1.add(19,190); 
	}
	*/
        Addition a2=(int x,int y)->{
        	return (x+y);
        };
        System.out.println(a2.add(905,176));
	}
	}

