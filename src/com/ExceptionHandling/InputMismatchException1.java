package com.ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.println("Enter a  number");
			int number=sc.nextInt();
			System.out.println("The value is:"+number);
		}catch(InputMismatchException e) {
			System.out.println("NumberFormatException:"+e);
			e.printStackTrace();
		}finally {
			System.out.println("FinallyBlock is always executed");
		}


	}

}
