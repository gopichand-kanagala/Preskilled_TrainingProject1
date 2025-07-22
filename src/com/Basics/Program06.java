package com.Basics;

public class Program06 {
	
	public static int add(int a,int b) {
		
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.print("Sum:");
		/*int a=10;
		int b=25;
		System.out.println("Sum is:"+(a+b));*/
		int sum=add(85,95);
		System.out.println(sum);

	}

}
