package com.Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=995,b=343;
		System.out.println("Logical Operators");
		System.out.println(a>1000 && b<3000);
		System.out.println(a<1000 && b<3000);
		System.out.println(a>1000 || b<3000);
		System.out.println(a>1000 || b>3000);
		System.out.println(!(a>1000 || b<3000));
		System.out.println(!(a>1000 || b>3000));
	}

}
