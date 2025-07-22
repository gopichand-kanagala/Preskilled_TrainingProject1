package com.ControlStatements;

public class ForLoopWithContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		for(int i=1;i<=100;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("The Loop is:"+i);
		}
		System.out.println("Main Method Ended");
	}

}
