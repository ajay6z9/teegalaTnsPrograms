package com.tnsif.staticprogram;

public class Employee {
	int eid;
	String name;
	static String companyname="TCS";
	Employee(int r,String n){
		eid=r;
		name=n;
		
	}
	static void change() {
		companyname="ibm";
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);
	}
	public static void main(String[] args) {
		Employee.change();
		Employee e1= new Employee(12,"ajay");
		Employee e2= new Employee(13,"hasrsh");
		Employee e3= new Employee(14,"vinay");
		e1.display();
		e2.display();
		e3.display();
		
	}
}
