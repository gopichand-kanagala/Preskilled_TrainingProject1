package com.OopsPrograms;



interface Interface11{
	default void add(int a,int b) {
		System.out.println("The Sum Of "+a+" "+b+" is"+(a+b));
	}
	default void subract(int a,int b) {
		System.out.println("The Subraction Of "+a+" "+b+" is"+(a-b));
	}
	default void product(int a,int b) {
		System.out.println("The Multiplication Of "+a+" "+b+" is"+(a*b));
	}
	default void division(int a,int b) {
		System.out.println("The Division Of "+a+" "+b+" is"+(a/b));
	}
	default void modularDivision(int a,int b) {
		System.out.println("The modular Division Of:"+a+" "+b+" is"+(a%b));
	}
	
}

interface Interface2{
	
	default void add(int a,int b) {
		System.out.println("This is defaultMethod1");
		System.out.println("The Sum Of "+a+" "+b+" is"+(a+b));
		System.out.println("Performed Addition OPeration Successfully");
	}
	default void subract(int a,int b) {
		System.out.println("This is defaultMethod2");
		System.out.println("The Subraction Of "+a+" "+b+" is"+(a-b));
		System.out.println("Performed Subraction OPeration Successfully");
	}
	default void product(int a,int b) {
		System.out.println("This is defaultMethod3");
		System.out.println("The Multiplication Of "+a+" "+b+" is"+(a*b));
		System.out.println("Performed Multiplication OPeration Successfully");
	}
	default void division(int a,int b) {
		System.out.println("This is defaultMethod4");
		System.out.println("The Division Of "+a+" "+b+" is"+(a/b));
		System.out.println("Performed Division OPeration Successfully");
	}
}
public class InterfacesWithSameMethods implements Interface11,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i2= new InterfacesWithSameMethods();
		i2.add(240,220);
		i2.subract(676, 3);
		i2.product(987,4);
		i2.product(567,2);
		Interface11 i1= new InterfacesWithSameMethods();
		i1.modularDivision(220,110);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		Interface2.super.add(a, b);
	}

	@Override
	public void subract(int a, int b) {
		// TODO Auto-generated method stub
		Interface2.super.subract(a, b);
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		Interface2.super.division(a, b);
	}

	@Override
	public void product(int a, int b) {
		// TODO Auto-generated method stub
		Interface2.super.product(a, b);
	}

}
