package com.tnsif.constructordemo;
import java.util.Scanner;

public class Constructordemo {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter your id :");
			int id = sc.nextInt();
			System.out.println("enter your name");
			String name = sc.next();
			System.out.println("enter your address");
		    String address = sc.nextLine();
			
			//String address = sc.next();
			
			
			Customer c=new Customer();
			
			c.setCustomerid(id);
			c.setCustomername(name);
			c.setCustomeraddress(address);
			System.out.println(c);
			
			
		}
	

}
