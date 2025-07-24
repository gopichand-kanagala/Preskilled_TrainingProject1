package com.OopsPrograms;

public class MethodOverLoadingCode {
	
	
	public void totalRentPerMonth(int foodPrice,double rentPerHouse,double otherExpenses) {
		
		double totalRent=foodPrice+rentPerHouse+otherExpenses;
		System.out.println(totalRent);
	}
	
   public void totalRentPerMonth(int foodPrice,int rentPerHouse,int otherExpenses) {
		
		int totalRent=foodPrice+rentPerHouse+otherExpenses;
		System.out.println(totalRent);
	}
   
   public void totalRentPerMonth(long foodPrice,long rentPerHouse,long otherExpenses) {
		
		long totalRent=foodPrice+rentPerHouse+otherExpenses;
		System.out.println(totalRent);
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingCode m=new MethodOverLoadingCode();
		m.totalRentPerMonth(7000, 35000.563, 24000.056);
		m.totalRentPerMonth(5000, 15000, 12000);
		m.totalRentPerMonth(55000, 75000, 96000);
	}

}
