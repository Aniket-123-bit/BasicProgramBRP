package com.day1;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if(year >= 1582)
		{
		if
		 (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   	}
		else
		 System.out.println("Enter the Year greater than 1582");

	}

}
