package com.tnsif.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {
	@Override
	public void show() {
		System.out.println("inner interface method");
	}

}
