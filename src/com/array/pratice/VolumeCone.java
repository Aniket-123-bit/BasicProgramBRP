package com.array.pratice;
import java.util.*;

public class VolumeCone {
	public static void main(String args[]) {
		float pie=3.14F;
		float radius,hight,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextFloat();
		System.out.println("Enter hight");
		hight=sc.nextFloat();
		volume=(pie*radius*radius*hight)/3;
		System.out.println("Volume of cone:"+volume);
		
		
	}

}
