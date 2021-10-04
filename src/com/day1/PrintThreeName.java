package com.day1;
import java.util.*;
public class PrintThreeName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String s1 = sc.next();
		System.out.println("Enter Second Name");
		String s2 = sc.next();
		System.out.println("Enter Third Name");
		String s3 = sc.next();
		sc.close();

		System.out.println("Hi" + " " + s3 + " ," + s2 + "and" + " " + s1 +". ");
	}

}
