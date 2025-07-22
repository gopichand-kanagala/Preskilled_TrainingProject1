package com.Basics;

import java.util.Scanner;
public class Program08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bool value");
		boolean true_Variable=sc.nextBoolean();
		System.out.println("enter bool value");
		boolean false_Variable=sc.nextBoolean();
		System.out.println("enter byte value");
		byte byte_Variable=sc.nextByte();
		System.out.println("enter short value");
		short short_Variable=sc.nextShort();
		System.out.println("enter int value");
		int int_Variable=sc.nextInt();
		System.out.println("enter long value");
		long long_Variable=sc.nextLong();
		System.out.println("enter float value");
		float float_Variable=sc.nextFloat();
		System.out.println("enter double value");
		double double_Variable=sc.nextDouble();
		System.out.println("enter char value");
		char char_Variable=sc.next().charAt(0);
		System.out.println("Primitive Data Types");
		System.out.println("bool variables are:"+true_Variable+" "+false_Variable);
		System.out.println("byte variables are:"+byte_Variable);
		System.out.println("short variables are:"+short_Variable);
		System.out.println("int variables are:"+int_Variable);
		System.out.println("long variables are:"+long_Variable);
		System.out.println("float variables are:"+float_Variable);
		System.out.println("double variables are:"+double_Variable);
		System.out.println("char variables are:"+char_Variable);

	}

}
