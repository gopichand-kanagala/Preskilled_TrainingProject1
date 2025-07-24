package com.Assesments;

import java.util.Random;
public class Assesment2_1Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		long min=1000000000L;
		long max=9999999999L;
		
		long randomNumber=min+((long) (random.nextDouble()*(max-min)));
		System.out.println("generated 10digit random Number:"+randomNumber);

	}

}
