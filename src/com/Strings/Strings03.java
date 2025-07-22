package com.Strings;

public class Strings03 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);
		sb.append("Ram Gopichand Kanagla");
		System.out.println(sb);
		sb.insert(5, "Hi");
		System.out.println(sb);
		sb.replace(5,7,"");
		System.out.println(sb);
		sb.delete(11,18);
		System.out.println(sb);
		
		System.out.println(sb.capacity());

	}

}
