package com.ExceptionHandling;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		if(number1<18) {
			//throw new RuntimeException("Not Eligibletovote");
			throw new ArithmeticException("Not Eligibletovote");
		}else {
			System.out.println("Eligible to Vote");
		}

	}

}
