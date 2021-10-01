package com.array.pratice;
import java.util.*;

public class Sqr {
	public static void main(String args) {
		int n,sqr,cube,i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		n=in.nextInt();
		System.out.println("No."+"\t"+"squre"+"\t"+"cube");
		while(i<=n) {
			sqr=i*i;
			cube=i*i*i;
			System.out.println(i+"\"\\t\"+\"squre\"+\"\\t\"+\"cube");
			i++;
		}
	}

}
