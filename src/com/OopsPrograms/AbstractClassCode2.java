package com.OopsPrograms;



abstract class Vehicle1{
	
	abstract void speedLimit();
	abstract void brand();
	abstract void milage();
	
}
class HyundaiCar extends Vehicle1{
	 void speedLimit() {
		System.out.println("Hyundai car can go 60km/hr");
	}
	void brand() {
		System.out.println("Hyundai car is No.1 brand");
	}
	@Override
	void milage() {
		System.out.println("Hyundai car will give good milage 20 km");
	}
	
}

class SwiftCar extends Vehicle1{
	 void speedLimit() {
		System.out.println("Swift car can go 45km/hr");
	}
	void brand() {
		System.out.println("Swift car is No.2 brand");
	}
	void milage() {
		System.out.println("Swift car will give good milage 30 km");
	}
}

public class AbstractClassCode2 {

	public static void main(String[] args) {
		
		Vehicle1 v=new HyundaiCar();
		v.speedLimit();
		v.brand();
		v.milage();
		Vehicle1 v1=new SwiftCar();
		v1.speedLimit();
		v1.brand();
		v1.milage();
		
	}

}
