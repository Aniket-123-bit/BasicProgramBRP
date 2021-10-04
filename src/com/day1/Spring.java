package com.day1;
import java.util.Scanner;
public class Spring {
	 public static void main(String[] args){
	      
	      int m;
	      int d;

	      System.out.println("Enter the month : ");
	      Scanner sc = new Scanner(System.in);
	      m = sc.nextInt();
	      System.out.println("Enter the day : ");
	      d = sc.nextInt();

	      boolean isSpring =  (m == 3 && d >= 20 && d <= 31)
	                       || (m == 4 && d >=  1 && d <= 30)
	                       || (m == 5 && d >=  1 && d <= 31)
	                       || (m == 6 && d >=  1 && d <= 20);
		System.out.println(" "+isSpring);	

}
}
