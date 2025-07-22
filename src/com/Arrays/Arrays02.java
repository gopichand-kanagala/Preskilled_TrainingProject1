package com.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,12,13,14,15,9,23};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		int min=arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Minimum element is "+min);
		System.out.println("Maximum element is "+max);
		


	}

}
