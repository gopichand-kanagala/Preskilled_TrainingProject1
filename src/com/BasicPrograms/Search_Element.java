package com.BasicPrograms;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {98,102,103,87,76};
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number) {
				System.out.println(number+" found in "+i+" position");
				c=c+1;
				break;
			}
		}
		if(c==0) {
			System.out.println(number+" not found and not in the array");
		}

	}

}
