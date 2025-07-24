package com.OopsPrograms;

interface Vehicle2{
	
	abstract void speedLimit();
	abstract void brand();
	abstract void milage();
}
class ErtigaCar implements Vehicle2{
	 public void speedLimit() {
		System.out.println("Ertiga car can go 60km/hr");
	}
	public void brand() {
		System.out.println("Hyundai car is No.1 brand");
	}
	@Override
	public void milage() {
		System.out.println("Ertiga car will give good milage 36 km");
		
	}
}

class TharCar implements Vehicle2{
	 public void speedLimit() {
		System.out.println("Thar car can go 35km/hr");
	}
	public void brand() {
		System.out.println("Swift car is No.2 brand");
	}
	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("Ertiga car will give good milage 45 km");
	}
}

public class InterfaceCode2 {

	public static void main(String[] args) {
		
		Vehicle2 v=new ErtigaCar();
		v.speedLimit();
		v.brand();
		v.milage();
		Vehicle2 v1=new TharCar();
		v1.speedLimit();
		v1.brand();
		v1.milage();
	}

}


