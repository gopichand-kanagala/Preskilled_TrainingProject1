package com.BasicPrograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {98,102,103,87,76};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int arr1[]=new int[arr.length];
		int c=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[c]=arr[i];
			c=c+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
