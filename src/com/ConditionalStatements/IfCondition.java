package com.ConditionalStatements;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		
		//if condition 
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter age");
				int age=sc.nextInt();
				//if condition 
				if(age>18)
					System.out.println("Eligible to Vote");

	}

}
