package org.employeedetails;

public class Company extends Employee {
	@Override
	public void employeeId(int id) {
		System.out.println("Employee id is:" + id);
		this.employeeDob(14071998);
		this.employeeName1("Rose");
		super.employeeId(id);
	}
	@Override
	public void employeeDob(int DOB) {
		System.out.println("Employee dob is:" + DOB);
		this.employeeName("Jack");
		super.employeeDob(DOB);
	}
	
	public static void main(String[] args) {
		Company c = new Company();
		c.employeeId(259874);
	}
	
	
}
