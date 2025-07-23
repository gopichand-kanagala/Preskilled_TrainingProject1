package com.OopsPrograms;



interface PaymentMode{
	void pay(double amount);
}

class CreditCardPayment implements PaymentMode{
	
	public void pay(double amount) {
		System.out.println("The credictcard payment of "+amount+" transaction is successfull");
	}
}

class UpiPayment implements PaymentMode{
	public void pay(double amount) {
		
		System.out.println("The UpiPayment of"+amount+" transaction is successfull");
	}
}

class CashOnDelivary implements PaymentMode{
	
public void pay(double amount) {
		
		System.out.println("The CashOnDelivary Payment of"+amount+" transaction is successfull");
	}
	
}
public class EcommercePaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMode c=new CreditCardPayment();
		c.pay(35000);
		
		 PaymentMode u=new  UpiPayment();
		 u.pay(40000);
		 
		 PaymentMode c1=new CashOnDelivary();
		 c1.pay(50000);
		 
		 
		 
		

	}

}
