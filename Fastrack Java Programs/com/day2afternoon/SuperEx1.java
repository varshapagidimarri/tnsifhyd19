package com.day2afternoon;
class Color{
	String name="color1";
}
class Red extends Color{
	String name="color2";

void show() {
	System.out.println(name);
	System.out.println(super.name);
}
}

 class SuperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Red r= new Red();
         r.show();
         }

}

