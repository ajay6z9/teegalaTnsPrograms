package com.tnsif.constructordemo;

public class Parameterdemo {
	Parameterdemo()
	{
		System.out.println("default");
	}
	Parameterdemo(int a){
		System.out.println("1 parameter " +a);
	}
	Parameterdemo(int a , String name){
		System.out.println("2 paramters " +a+ " name :" +name);
		
	}
	public static void main(String[] args) {
		Parameterdemo obj1 = new Parameterdemo();
		Parameterdemo obj2 = new Parameterdemo(1);
		Parameterdemo obj3 = new Parameterdemo(1,"ajay");
		
	}

}
