package com.polymorphism.methodoverloading;
// demo contstructor overriding
public class Point {

	private float x;
	private float y;
	public Point() {
		x=9.0f;
		y=10.f;
	}
	public Point(float f) {
		this.x=x;
		y=6.5f;
		
	}
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p);
		Point p1 = new Point(7f);
		System.out.println(p1);
		Point p2 = new Point(9.5f,7.0f);
		System.out.println(p2);
	}
}
