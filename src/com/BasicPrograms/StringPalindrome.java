package com.BasicPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String");
		String string=sc.nextLine();
		StringBuffer stringBuffer=new StringBuffer(string);
		StringBuffer reverse=stringBuffer.reverse();
		String reverse1="";
		for(int i=0;i<reverse.length();i++) {
			reverse1=reverse1+reverse.charAt(i);
		}
		if(string.equals(reverse.toString())) {
			System.out.println(string+" is palindrome");
		}
		else {
			System.out.println(string+" is not palindrome");
		}
		/*
		 * if(string.equals(reverse1)) {
			System.out.println(string+" is palindrome");
		}
		else {
			System.out.println(string+" is not palindrome");
		}
		 */

	}

}
