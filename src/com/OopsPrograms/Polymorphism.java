package com.OopsPrograms;


class Shape{
	void draw() {
		System.out.println("In This World Every Thing has a Shape");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle is so easy");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square is easy and it has a good shape");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Shape();
		s.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape sq=new Square();
		sq.draw();

	}

}
