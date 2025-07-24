package com.LambdaExpression;

@FunctionalInterface
interface Multiplication{
	void product(int a,int b);
	default void defaultMethod() {
		System.out.println("This is a defaultMethod");
	}
	static void method2() {
		System.out.println("This is a static method");
	}
}

public class MultiplicationProgram02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiplication multiplication=(a,b)->{
			System.out.println("A is:"+a);
			System.out.println("B is:"+b);
			System.out.println("Prodduct is:"+(a*b));
		};
		multiplication.product(317,376);
		multiplication.defaultMethod();
		Multiplication.method2();

	}

}
