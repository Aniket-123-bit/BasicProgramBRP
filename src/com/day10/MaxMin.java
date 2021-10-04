package com.day10;
import java.util.Random;
import java.util.*;


public class MaxMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        // Minimum And Maximum 
        int count = 0;
        int min = 0;
        int max = 0;
        boolean bugSolved = true;
	
        while (true){
            int cnt = count++;
            System.out.print("Enter Number #"+(cnt+1)+": ");
            boolean isValid = input.hasNextInt();
            if(isValid){
               int num = input.nextInt();
               /* if (bugSolved){
                   bugSolved = false;
                   min = num;
                   max = num;
               }  # Just remove this condition and 
               	boolean (bugSolved) at the top, if you use 
               	int min = Integer.MAX_VALUE and int max = 
                Integer.MIN_VALUE */
                if (num < min) {
                    min = num;
                }else if (num > max){
                    max = num;
                }
            }else{
                System.out.println("Invalid input..");
                break;
            }
            input.nextLine();
        }
        System.out.println("Min Number : " + min);
        System.out.println("Max Number : " + max);
		
	}

}
