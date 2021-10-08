package com.array.pratice;
import java.util.Scanner;

public class AreaCircle {
	public static void main(String args []) {
		float pie=3.14F;
		float radius,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=sc.nextFloat();
		area=pie*radius*radius;
		System.out.println("Area of circle:"+area);
		
	}

}
