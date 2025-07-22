package com.ControlStatements;

public class ForLoopWithBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main Method Started");
		
		for(int i=1;i<=100;i++) {
			if(i==5) {
				break;
			}
			System.out.println("The Loop is:"+i);
		}
		
		
		
		System.out.println("Main Method Ended");
	}

}
