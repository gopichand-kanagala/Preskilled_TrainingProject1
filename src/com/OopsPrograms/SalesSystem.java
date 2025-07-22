package com.OopsPrograms;

class SaleItem{
	public String productName;
	public int price;
	public int quantity;
	
	public SaleItem(String productName,int price,int quantity) {
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int totalAmount() {
		return price*quantity;
	}
	public void getProductDisplay() {
		System.out.println("productName  "+productName+" price  "+price+"Quantity "+quantity+" totalAmount:"+totalAmount());
	}
	
	
}


public class SalesSystem {

	public static void main(String[] args) {
		
		int totalPrice=0;
		SaleItem[] salesitem= {
				               new SaleItem("Laptop",50000,2),
				               new SaleItem("Desktop",30000,1),
				               new SaleItem("Mouse",700,1)
		                      };
		for(SaleItem item:salesitem) {
			item.getProductDisplay();
			totalPrice+=item.totalAmount();
		}
		System.out.println("TotalPriceEarnedBySellingItems:"+totalPrice);
	}

}
