package com.ControlStatements;

public class WhileLoopWithBreak {

	public static void main(String[] args) {
System.out.println("Main Method Started");
		
		int i=1;
		while(i<=20) {
			if(i==5) {
				break;
			}
			System.out.println("While Loop is Running"+i+"time");
			i=i+1;
		}
		System.out.println("Main Method Ended");

	}

}
