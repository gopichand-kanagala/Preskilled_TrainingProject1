package com.OopsPrograms;

interface Company1{
	abstract void typeOfDevice();
	abstract void runTimeSpeed();
	abstract void noOfWorkingHours();
}
class Hcl1 implements Company1{
	@Override
	public void typeOfDevice() {
		System.out.println("Desktop Assigned to us by hcl ");
	}
	@Override
	public void runTimeSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Desktop will work faster than Laptop ");	
	}
	@Override
	public void noOfWorkingHours() {
		// TODO Auto-generated method stub
		System.out.println("number of working hours is 8 ");	
	}
}

class Wipro1 implements Company1{
	@Override
	public void typeOfDevice() {
		System.out.println("Laptop Assigned to us by wipro");
		
	}
	@Override
	public void runTimeSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Laptop will work slower than Laptop");
	}
	@Override
	public void noOfWorkingHours() {	// TODO Auto-generated method stub
		System.out.println("number of working hours is 9 ");
	}
}

public class InterfaceCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c=new Hcl();
		c.typeOfDevice();
		c.runTimeSpeed();
		c.noOfWorkingHours();
		Company w=new Wipro();
		w.typeOfDevice();
		w.runTimeSpeed();
		w.noOfWorkingHours();

	}

}



