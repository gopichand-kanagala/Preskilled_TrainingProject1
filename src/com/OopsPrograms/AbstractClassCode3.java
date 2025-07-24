package com.OopsPrograms;
abstract class Company{
	abstract void typeOfDevice();
	abstract void runTimeSpeed();
	abstract void noOfWorkingHours();
}
class Hcl extends Company{
	@Override
	void typeOfDevice() {
		System.out.println("Desktop Assigned to us by hcl ");
	}
	@Override
	void runTimeSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Desktop will work faster than Laptop ");	
	}
	@Override
	void noOfWorkingHours() {
		// TODO Auto-generated method stub
		System.out.println("number of working hours is 8 ");	
	}
}

class Wipro extends Company{
	@Override
	void typeOfDevice() {
		System.out.println("Laptop Assigned to us by wipro");
		
	}
	@Override
	void runTimeSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Laptop will work slower than Laptop");
	}
	@Override
	void noOfWorkingHours() {	// TODO Auto-generated method stub
		System.out.println("number of working hours is 9 ");
	}
}

public class AbstractClassCode3 {

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
