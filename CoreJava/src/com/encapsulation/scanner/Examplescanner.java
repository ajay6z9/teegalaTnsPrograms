package com.encapsulation.scanner;
import java.util.Scanner;

public class Examplescanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your roll number: ");
        int a = sc.nextInt();  
        
        System.out.println("Your roll number is: " + a);
        
        sc.close();  
    }
}
