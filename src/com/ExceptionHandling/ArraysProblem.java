package com.ExceptionHandling;

public class ArraysProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;arr[2]=21;arr[3]=27;arr[4]=28;
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception "+e);
		}

	}

}
