package com.array.pratice;
import java.util.*;

public class NetSalary {
	public static void main(String args []) {
		int bs,empc;
		float bonus,ns;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Emp code:");
		empc=in.nextInt();
		System.out.println("Enter basic salary:");
		bs=in.nextInt();
		bonus=(bs*12)/100;
		ns=bonus+bs;
		System.out.println("\nBonus:"+bonus);
		System.out.println("\nNet salary:"+ns);
	}
	

}
