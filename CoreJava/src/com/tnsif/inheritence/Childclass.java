package com.tnsif.inheritence;

public class Childclass extends Parentclass {
	int a=6;
	void show() {
		System.out.println("coffee");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		show();
		super.show();
	}
	
public static void main(String[] args) {
	Childclass obj = new Childclass();
	obj.display();
	
}
}
