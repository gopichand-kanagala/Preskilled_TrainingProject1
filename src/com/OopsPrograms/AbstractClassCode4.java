package com.OopsPrograms;

abstract class RealEstate{
	abstract void home();
	abstract void apartment();
}

class Ram extends RealEstate{
	@Override
	void home() {
		int foodCost=7000;
		float rent=17000.0f;
		float otherExpenses=6800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
	}
	@Override
	void apartment() {
		// TODO Auto-generated method stub
		int foodCost=8000;
		float rent=12000.0f;
		float otherExpenses=9800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
		
	}
}

class Gopi extends RealEstate{
	@Override
	void home() {
		int foodCost=6000;
		float rent=16000.0f;
		float otherExpenses=9870.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
	}
	@Override
	void apartment() {
		// TODO Auto-generated method stub
		int foodCost=9000;
		float rent=14000.0f;
		float otherExpenses=16800.065f;
		double totalAmount=foodCost+rent+otherExpenses;
		System.out.println(totalAmount);
		
	}
}

public class AbstractClassCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealEstate r=new Ram();
		r.home();
		r.apartment();
		RealEstate r1=new Gopi();
		r1.home();
		r1.apartment();

	}

}
