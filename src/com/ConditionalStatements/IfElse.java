package com.ConditionalStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Eligible to Drive");
		}else {
			System.out.println("Not Eligible to Drive");
		}

	}

}
