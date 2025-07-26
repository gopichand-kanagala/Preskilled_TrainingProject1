package com.ExceptionHandling;

import java.util.Scanner;

public class NumberFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  String");
		String string=sc.nextLine();
		try{
			System.out.println("The value is:"+string);
			int number=Integer.parseInt(string);
			System.out.println("The value is:"+string);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e);
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException:"+e);
			e.printStackTrace();
		}finally {
			System.out.println("FinallyBlock is always executed");
		}

	}

}
