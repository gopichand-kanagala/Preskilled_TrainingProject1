package com.LambdaExpression;

@FunctionalInterface
interface Addition{
	void sum(int a,int b);
	default void method1() {
		System.out.println("Method 1 in the Interface");
	}
	static void method2() {
		System.out.println("Static method is Present");
	}
}
public class AddiitionProgramUsingLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition addition=(a,b)->{
			System.out.println("A is:"+a);
			System.out.println("B is:"+b);
			System.out.println("Sum is:"+(a+b));
		};
		addition.sum(317,376);
		addition.method1();
		Addition.method2();
		
		
	}

}
