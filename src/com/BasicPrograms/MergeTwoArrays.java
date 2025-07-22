package com.BasicPrograms;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {11,13,15,16,17,18};
		int arr2[]= {17,21,23,25,29,34};
		
		int arr3[]=new int[arr1.length+arr2.length];
		int c=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[c]=arr1[i];
			c=c+1;
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[c]=arr2[i];
			c=c+1;
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		

	}

}
