package com.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		System.out.println("enter number2");
		int number2=sc.nextInt();
		int result;
		try {
			result=number1/number2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e);
			e.printStackTrace();
			e.getMessage();
		}
	}

}
