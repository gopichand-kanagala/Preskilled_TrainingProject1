package com.OopsPrograms;
abstract class Employee{
	
	public int employeeId;
	public String employeeName;
	
	public Employee(int employeeId,String employeeName) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	public void display() {
		System.out.println("Employee Id is:"+employeeId);
		System.out.println("Employee Name is:"+employeeName);
	}
	abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
	
	double salary;
	public FullTimeEmployee(int employeeId,String employeeName,double salary){
		
		super(employeeId,employeeName);
		this.salary=salary;
	}
	double calculateSalary() {
		
		return salary;
	}
}

class PartTimeEmployee extends Employee{
	
	double ratePerHour;
	int hoursWorked;
	public PartTimeEmployee(int employeeId,String employeeName,double ratePerHour,int hoursWorked){
		
		super(employeeId,employeeName);
		this.ratePerHour=ratePerHour;
		this.hoursWorked=hoursWorked;
	}
	double calculateSalary() {
		
		return ratePerHour*hoursWorked;
	}
}


public class EmployeePayRollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new FullTimeEmployee(1,"Ram",350000.056);
		e1.display();
		System.out.println(e1.calculateSalary());
		
		Employee e2=new PartTimeEmployee(2,"Gopi",800,8);
		e2.display();
		System.out.println(e2.calculateSalary());

	}

}
