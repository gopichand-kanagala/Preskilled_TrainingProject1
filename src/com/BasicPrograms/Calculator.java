package com.BasicPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int number1=765,number2=542;
		System.out.println("Enter which Operation You have to Perform\n"
				+ "1.Addition\n"
				+ "2.Subraction\n"
				+"3.Multiplication\n"
				+"4.Division");
		System.out.print("enter a number from 1 to 4:");
		int num=sc.nextInt();
		switch(num) {
		
		case 1:
			System.out.println("Addition Of Two numbers is:"+(number1+number2));
			break;
		case 2:
			System.out.println("Subraction Of Two numbers is:"+(number1-number2));
			break;
		case 3:
			System.out.println("Multiplication Of Two numbers is:"+(number1*number2));
			break;
		case 4:
			System.out.println("Division Of Two numbers is:"+(number1/number2));
			break;
		default:
			System.out.println("Other Operations are not allowed");
	}

}}
