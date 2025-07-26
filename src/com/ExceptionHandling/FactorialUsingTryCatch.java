package com.ExceptionHandling;
import java.util.Scanner;
public class FactorialUsingTryCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int fact=1;
		for(int i=number;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial Of number "+number+" is "+fact);
		}catch(Exception e){
			System.out.println("Exception "+e);
		}
		
		
	}

}
