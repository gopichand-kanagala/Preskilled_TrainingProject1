package com.Basics;

public class  Program04 {

	public static void main(String[] args) {
		try {
			
			if(args.length<2) {
				System.out.println("pease enter 2 argumenets");
			}
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println(num1+num2);
			
		}catch(Exception e) {
			System.out.println("The Exception occured is:"+ e);
		}

	}

}

