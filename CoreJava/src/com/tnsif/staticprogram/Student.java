package com.tnsif.staticprogram;

public class Student {
	int rollno;
	String name;
	static String college ="IIT";
	static void change() {
		college="tkr";
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno +" "+ name +" "+college);
		
	}
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"ajay");
	}
	
}

