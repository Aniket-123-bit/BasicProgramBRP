package com.day2;
import java.util.Scanner;


public class DoubleOpt {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter three inputs for calculations:");
	        double a=sc.nextDouble();
	        double b=sc.nextDouble();
	        double c=sc.nextDouble();
	        DoubleOpt.operation(a,b,c);
	    }

	    private static void operation(double a, double b, double c) {
	        double oprt1 = a+b*c;
	        double oprt2 = a*b+c;
	        double oprt3 = c+a/c;
	        double oprt4 = a%b+c;
	        System.out.println("a+b*c="+oprt1+"\na*b+c="+oprt2+"\na*b+c="+oprt3+"\na%b+c="+oprt4);

	    }
	}

