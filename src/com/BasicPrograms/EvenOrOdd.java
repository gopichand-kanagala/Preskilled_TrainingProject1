package com.BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is even");
		}else {
			System.out.println(number+" is odd");
		}
	}

}
