package com.BasicPrograms;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		if(number1>number2 && number2>number3) {
			System.out.println(number1+" is big");
		}
		if(number2>number3) {
			System.out.println(number2+" is big");
		}
		else {
			System.out.println(number3+" is big");
		}

	}

}
