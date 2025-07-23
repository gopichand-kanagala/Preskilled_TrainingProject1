package com.OopsPrograms;

public class BankProject {
	
	
	String accountNumber;
	String accountHolderName;
	double amount;
	
	public BankProject(String accountNumber,String accountHolderName,double amount) {
		
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.amount=amount;
	}
	
	public void deposit(double addAmount) {
		
		amount+=addAmount;
	}
	public void withdrawl(double reduceAmount) {
		if(reduceAmount>amount) {
			System.out.println("withdrawl is not possible because you are trying to withdrawl more than actual");
		}else {
			
			System.out.println("withdrawl is  possible because you are trying to withdrawl less than actual");
			amount-=reduceAmount;
			System.out.println(reduceAmount);
		}
	}
	
	public void showDetails() {
		
		System.out.println("AccountNumber:"+accountNumber);
		System.out.println("AccountHolderName:"+accountHolderName);
		System.out.println("amount:"+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankProject b=new BankProject("1234gt568","Gopi",35000);
		b.deposit(10000);
		b.withdrawl(50000);
		b.withdrawl(20000);
		b.showDetails();
		
		BankProject b1=new BankProject("12764gt561","Ram",25000);
		b.deposit(40000);
		b.withdrawl(5000);
		b.withdrawl(300000);
		b.showDetails();
		

	}

}
