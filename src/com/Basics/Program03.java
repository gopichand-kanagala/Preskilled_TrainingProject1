package com.Basics;

import java.util.Scanner;
public class Program03 {
	
	public void add(int a,int b) {
		System.out.println("Sum is:"+(a+b));
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Program03 p=new Program03();
		p.add(20, 98);
		

	}

}
