package com.ExceptionHandling;

import java.util.Scanner;

public class NullPointerException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=null;
		
		try{
			System.out.println("The String is:"+string);
			string=string.toLowerCase();
			System.out.println("The String is:"+string);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e);
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException:"+e);
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException:"+e);
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index OutOfBoundsException:"+e);
			e.printStackTrace();
		}finally {
			System.out.println("FinallyBlock is always executed");
		}
	}

}
