package com.tnsif.abstractiondemo;

public class Square extends Shape {
	private float side;
	public Square() {
		side=2.0f;
	}
	Square (float area){
		this.side=side;
		
	}

	@Override
	void calarea() {
		// TODO Auto-generated method stub
		super.area=side*side;
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	public static void main(String[] args) {
		Square obj=new Square();
		System.out.println(obj);
		obj.calarea();
		obj.show();
		//System.out.println(obj);
		
		
	}
	
	

}
