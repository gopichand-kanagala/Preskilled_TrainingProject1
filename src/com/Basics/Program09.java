package com.Basics;

public class Program09 {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		/*
		if(args.length<2) {
			System.out.println("Enter 2 args minimum otherwise the program will be terminated");
			return;
		}
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		System.out.println("Addition is:"+(num1+num2));
		System.out.println("Subraction is:"+(num1-num2));
		System.out.println("Multiplication is:"+(num1*num2));
		System.out.println("Division is:"+(num1/num2));
		*/
		
		if(args.length<3) {
			System.out.println("Enter 3 args minimum otherwise the program will be terminated");
			return;
		}
		
		String first_Arg=args[0];
		int second_Arg=Integer.parseInt(args[1]);
		String third_Arg=args[2];
		 
		System.out.println("My Name is "+first_Arg+", Iam"+second_Arg+" years");
		System.out.println("          old and i am working in "+third_Arg+"Company");
		
		
		
		System.out.println("Main Method Ended");
	}

}
