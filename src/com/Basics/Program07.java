package com.Basics;

public class Program07 {
	
	public int count=0;
	
	public void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		
		Program07 p1=new Program07();
		p1.increment();
		p1.increment();
		Program07 p2=new Program07();
		p2.increment();
		p2.increment();
		p2.increment();
		System.out.println("p1count:"+p1.count);
		System.out.println("p2count:"+p2.count);
		
		
		
	}

}
