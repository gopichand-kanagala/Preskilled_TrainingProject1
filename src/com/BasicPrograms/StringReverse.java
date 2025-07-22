package com.BasicPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String");
		String string=sc.nextLine();
		StringBuffer stringbuffer=new StringBuffer(string);
		System.out.println(stringbuffer.reverse());

	}

}
