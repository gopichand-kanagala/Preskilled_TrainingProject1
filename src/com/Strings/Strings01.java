package com.Strings;

public class Strings01 {

	public static void main(String[] args) {
		
		String s1="Gopichand";
		String s2="Gopichand";
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
		
		String s3=new String("Gopichand");
		String s4=new String("Gopichand");
		System.out.println(s3==s4);
		System.out.println(s3!=s4);
		
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("ch"));
		System.out.println(s1.contains("i"));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.substring(1,6));
	}

}
