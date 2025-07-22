package com.Arrays;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println(arr.length);
		System.out.println(arr[0]);
		int arr1[]=new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;arr1[3]=40;arr1[4]=50;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		int arr2[]=new int[5];
		/*for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}*/
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		int md_arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<md_arr.length;i++)
		{
			for(int j=0;j<md_arr[i].length;j++)
			{
				System.out.print(md_arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] mdarr=new int[2][3];
		for(int i=0;i<mdarr.length;i++) {
			for(int j=0;j<mdarr[i].length;j++)
			{
				mdarr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<mdarr.length;i++)
		{
			for(int j=0;j<mdarr[i].length;j++)
			{
				System.out.print(mdarr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
