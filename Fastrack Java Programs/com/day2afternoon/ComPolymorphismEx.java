package com.day2afternoon;

//methodoverloading
public class ComPolymorphismEx {
	
	double add(int x,double y) {
		return(x+y);
	}
    double add(double x,int y) {
		return(x+y);
	}
    double add(double x,int y,float z) {
		return(x+y+z);
	}
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int a=5;
        float b=5.5f;
        double c=10.5;
        double result;
      
      ComPolymorphismEx x= new ComPolymorphismEx();
      result=x.add(a,c);
      System.out.println(result);
      result=x.add(c,a);
      System.out.println(result);
      result=x.add(c,a,b );
      System.out.println(result);
      
	}

}
