package com.OopsPrograms;

interface RealEstate1{
	void home();
	void apartment();
}

class Ram1 implements RealEstate1{
	@Override
	public void home() {
		int foodCost=7000;
		float rent=17000.0f;
		float otherExpenses=6800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
	}
	@Override
	public void apartment() {
		// TODO Auto-generated method stub
		int foodCost=8000;
		float rent=12000.0f;
		float otherExpenses=9800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
		
	}
}

class Gopi1 implements RealEstate1{
	@Override
	public void home() {
		int foodCost=6000;
		float rent=16000.0f;
		float otherExpenses=9870.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
	}
	@Override
	public void apartment() {
		// TODO Auto-generated method stub
		int foodCost=9000;
		float rent=14000.0f;
		float otherExpenses=16800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
		
	}
}

public class InterfaceCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealEstate1 r=new Ram1();
		r.home();
		r.apartment();
		RealEstate1 r1=new Gopi1();
		r1.home();
		r1.apartment();

	}

}



