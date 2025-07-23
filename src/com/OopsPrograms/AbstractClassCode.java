package com.OopsPrograms;

abstract class PaymentMode1{
	
	double amount;
	public PaymentMode1(double amount) {
		this.amount=amount;
	}
	abstract void payment();
	void showMsg() {
		System.out.println("This is the messsage present in the paymentmode "+amount);
	}
}

class CreditCard1 extends PaymentMode1{
	
	CreditCard1(double amount){
		super(amount);
	}
	void payment() {
		System.out.println("you have to pay "+amount);
		showMsg();
	}
}

class UpiPayment1 extends PaymentMode1{
	
	UpiPayment1(double amount){
		super(amount);
	}
	void payment() {
		System.out.println("you have to pay "+amount);
		showMsg();
	}
}

public class AbstractClassCode {

	public static void main(String[] args) {
		
		CreditCard1 c=new CreditCard1(35000);
		c.payment();
		
		UpiPayment1 u=new UpiPayment1(400000.045);
		u.payment();
		
	}

}
