package com.OopsPrograms;

interface payMoneyMode{
	void pay();
}

abstract class Class1 implements payMoneyMode{
	
	double amount;
	public Class1(double amount) {
		this.amount=amount;
	}
	
	void showMsg() {
		System.out.println("This is the messsage present in the paymentmode "+amount);
	}
}

class DebitCard2 extends Class1{
	
	
	DebitCard2(double amount){
		super(amount);
	}
	
	public void pay() {
		System.out.println("debitcard payment is successfull");
		showMsg();
	}
	
}

class NetBanking extends Class1{
	
	
	NetBanking(double amount){
		super(amount);
	}
	
	public void pay() {
		System.out.println("netbanking payment is successfull");
		showMsg();
	}
	
}

public class InterfaceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DebitCard2 c=new DebitCard2(35000);
		c.pay();
		
		NetBanking u=new NetBanking(400000.045);
		u.pay();
	}

}
