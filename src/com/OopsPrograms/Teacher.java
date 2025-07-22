package com.OopsPrograms;

public class Teacher {
	
	public int id;
	public String name;
	public float salary;
	
	void teacherDetails() {
		System.out.println("Id:"+id+" Name:"+name+" Salary:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1=new Teacher();
		t1.id=1;t1.name="Anjaiah Sir";t1.salary=35000.0f;
		System.out.println(t1.id+" "+t1.name+" "+t1.salary);
		t1.teacherDetails();
		
		Teacher t2=new Teacher();
		t2.id=2;t2.name="bhramarambha teacher";t2.salary=55000.06f;
		t2.teacherDetails();
		

	}

}
