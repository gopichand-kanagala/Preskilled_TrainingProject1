package com.BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int count=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				count=count+1;
				break;
			}
		}
		if(count==0) {
			System.out.println(number+" is a prime Number");
		}else {
			System.out.println(number+" is not a prime Number");
		}
	}

}
