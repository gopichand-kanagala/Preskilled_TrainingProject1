package com.BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int temp=number,rem=0,sum=0;
		while(number>0) {
			rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println(temp+"is  a palindrome number");
		}
		else {
			System.out.println(temp+"is not a palindrome number");
		}
	}

}
