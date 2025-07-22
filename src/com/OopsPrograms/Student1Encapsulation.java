package com.OopsPrograms;

class Student{
	
	private int studentId;
	private String studentName;
	private float fee;
	
	public void setStudentId(int studentId) {
		this .studentId=studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this .studentName=studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setSalary(float fee) {
		this .fee=fee;
	}
	
	public float getSalary() {
		return fee;
	}
	
}

public class Student1Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.setStudentId(1);
		s1.setStudentName("gopi");
		s1.setSalary(20000.56f);
		
		Student s2=new Student();
		s2.setStudentId(2);
		s2.setStudentName("ram");
		s2.setSalary(30000.03f);
		
		System.out.println(s1.getStudentId()+" "+s1.getStudentName()+" "+s1.getSalary());
		System.out.println(s2.getStudentId()+" "+s2.getStudentName()+" "+s2.getSalary());
		
		

	}

}
