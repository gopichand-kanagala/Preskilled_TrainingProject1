package com.BasicPrograms;

import java.util.Scanner;

public class ReplacingSpaces {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String");
		String string=sc.nextLine();
		string=string.replaceAll(" ", "-");
		System.out.println(string);
	}

}
