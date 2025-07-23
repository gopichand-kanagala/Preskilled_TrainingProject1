package com.OopsPrograms;


interface Interface1{
	
	void method1();
	default void defaultMethod() {
		System.out.println("This is a default method which is used to achieve backwardcompatibility");
		System.out.println("yow can provide separate implementation");
	}
	public static void method2() {
		System.out.println("This is static method which provides constant behaviour");
	}
	
}

public class LambdaExpressionCode {

	public static void main(String[] args) {
		
		Interface1 i=()->{
			
			for(int j=1;j<=10;j++) {
				System.out.print(j+" ");
			}
		};
		
		System.out.println();
		i.method1();
		i.defaultMethod();
		Interface1.method2();
		
	}

}
