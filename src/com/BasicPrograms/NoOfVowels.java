package com.BasicPrograms;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String string=sc.nextLine();
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' ||string.charAt(i)=='u' ||
					
			string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U') {
				
				count=count+1;
			}
		}
		System.out.println("No.Of vowels:"+count);

	}

}
