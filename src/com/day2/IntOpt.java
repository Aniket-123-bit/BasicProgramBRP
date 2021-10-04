package com.day2;

public class IntOpt {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter three inputs for calculations:");
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        IntOpt.operation(a,b,c);
	    }

	    private static void operation(int a, int b, int c) {
	        int oprt1 = a+b*c;
	        int oprt2 = a*b+c;
	        int oprt3 = c+a/c;
	        int oprt4 = a%b+c;
	        System.out.println("a+b*c="+oprt1+"\na*b+c="+oprt2+"\na*b+c="+oprt3+"\na%b+c="+oprt4);

	    }
	}

