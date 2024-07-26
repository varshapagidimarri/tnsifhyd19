package com.day3morning;

class Student{
	public int marks;
    public String sub;
    Student( String sub,int marks)
    {
        this.sub = sub;
        this.marks = marks;
    }
}
public class ArrayOfObjects {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr;
		   arr = new Student[5];
		   arr[0]=new Student("java",25);
		   arr[1]=new Student("c",20);
		   arr[2]=new Student("python",19);
		   arr[3]=new Student("befa",24);
		   arr[4]=new Student("dvt",23);
		   
		   for (int i = 0; i < arr.length; i++)
	            System.out.println(arr[i].sub +" "+ arr[i].marks);
	                        
	    }



	}


