package com.OopsPrograms;

interface InterfaceWithDefault1{
	
	void method1();
	void method2();
	default void defaultMethod1() {
		System.out.println("This is Default Method Which provides backward Compatibility");
		System.out.println("We Can Override This Method");
	}
	
	static void method3() {
		System.out.println("This is A Static Method Which Provides The Constant Behaviour");
	}
}

interface InterfaceWithDefault2{
	
	void method1();
	void method2();
	default void defaultMethod1() {
		System.out.println("This is Default Method Which provides backward Compatibility");
		System.out.println("We Can Override This Method");
	}
	
	static void method3() {
		System.out.println("This is A Static Method Which Provides The Constant Behaviour");
	}

}
abstract class ABSTRACTCLASS1 implements InterfaceWithDefault1,InterfaceWithDefault2{

	@Override
	public void method1() {
		System.out.println("This is Abstract Method1");
	}

	@Override
	public void method2() {
		System.out.println("This is Abstract Method2");
	}
	
	final void method3() {
		System.out.println("This is a final Method which can't be overrided");
	}
	public void defaultMethod1() {
		System.out.println("defaultMethod is Overrided");
	}
	
}


public class InterfaceWithVoiDDeafultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
