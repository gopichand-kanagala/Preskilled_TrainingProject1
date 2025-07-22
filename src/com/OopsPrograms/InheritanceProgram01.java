package com.OopsPrograms;


class Vehicle{
	
	public int speedLimit=70;
	public int seatCapacity=5;
	
	void milage() {
		System.out.println("The Vehicle will give a Good Milage");
	}
	void color() {
		System.out.println("The Vehicle will be good in any color.");
	}
}

class Bike extends Vehicle{
	
	void companyName() {
		System.out.println("The CompanyName Of a bike is Hero");
	}
}

public class InheritanceProgram01 {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		System.out.println(b.seatCapacity);
		System.out.println(b.speedLimit);
		b.companyName();b.color();b.milage();
		
		Vehicle v=new Vehicle();
		System.out.println(v.seatCapacity);
		System.out.println(v.speedLimit);
		v.color();v.milage();
		
	}

}
