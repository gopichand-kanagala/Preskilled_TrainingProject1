package com.ExceptionHandling;
import java.util.Scanner;
public class IndexOutOfBoundsException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string=sc.nextLine();
		try{
			System.out.println("The String is:"+string);
			System.out.println("The charcter at 5th index: "+string.charAt(5));
			System.out.println("The String is:"+string);
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index OutOfBoundsException:"+e);
			e.printStackTrace();
		}finally {
			System.out.println("FinallyBlock is always executed");
		}
	}

}
