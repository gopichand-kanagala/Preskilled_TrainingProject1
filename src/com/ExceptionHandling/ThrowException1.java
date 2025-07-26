package com.ExceptionHandling;

import java.util.Scanner;

public class ThrowException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		System.out.println("enter number2");
		int number2=sc.nextInt();
		try {
			if(number1+number2<1000) {
				//throw new GopiCustomException();
				throw new GopiCustomException("The 2 num sum must>=1000");
			}else {
				System.out.println("The 2 num sum>=1000");
			}
		}catch(GopiCustomException e) {
			System.out.println("Gopi Custom Excetion:"+e);
		}finally {
			System.out.println("finally block is always executed");
		}

	}

}
