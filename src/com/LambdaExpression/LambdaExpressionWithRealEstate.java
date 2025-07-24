package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Property{
	String address;
	double price;
	int noOfBedRooms;
	public Property(String address,double price,int noOfBedRooms) {
		this.address=address;
		this.price=price;
		this.noOfBedRooms=noOfBedRooms;
	}
	@Override
	public String toString() {
		return "Property [address=" + address + ", price=" + price + ", noOfBedRooms=" + noOfBedRooms + "]";
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int noOfBedRooms() {
		return noOfBedRooms;
	}
	
}
public class LambdaExpressionWithRealEstate {

	public static void main(String[] args) {
		
		List<Property> list=new ArrayList<Property>();
		list.add(new Property("hyderabad",350000.787,3));
		list.add(new Property("banglore",450000.132,2));
		list.add(new Property("chennai",300000.487,1));
		list.add(new Property("kerala",650000.783,1));
		
		
		List<Property> list1=list.stream().filter(price->price.getPrice()<450000).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Property> list2=list.stream().filter(noOfBedRooms->noOfBedRooms.noOfBedRooms()==3).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
