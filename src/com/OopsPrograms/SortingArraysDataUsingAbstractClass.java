package com.OopsPrograms;

abstract class ArrayData1{
	abstract void sort(String[] arr);
}


class SortingArray1 extends ArrayData1{
	
	public void sort(String[] arr) {
		
		/*arr=new String[5];
		arr[0]="Ram";arr[1]="Gopi";arr[2]="Chand";arr[3]="kanagla";arr[4]="AmmaNanna";*/
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>=0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
				System.out.print(arr[i]+"  ");
		}
		
		
	}
}
public class SortingArraysDataUsingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Ram","Gopi","chand","kanagala"};
		
		ArrayData1 a=new SortingArray1();
		a.sort(arr);

	}

}




