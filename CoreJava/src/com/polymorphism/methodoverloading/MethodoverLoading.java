package com.polymorphism.methodoverloading;

public class MethodoverLoading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodoverLoading obj = new MethodoverLoading();

		System.out.println(obj.add(2, 5));
		System.out.println(obj.add(2, 4, 6));
	}
}
