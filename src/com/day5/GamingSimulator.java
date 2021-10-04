package com.day5;
import java.util.Scanner;

public class GamingSimulator {

    public static void main(String[] args) {
	
        System.out.print("Enter the stake number : ");
        Scanner s = new Scanner(System.in);
	int stake = s.nextInt();
        
	System.out.print("Enter the goal : ");
	int goal = s.nextInt();

        System.out.print("Enter the trails no. : ");
	int trials = s.nextInt();

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win Rs.1
                else                     cash--;     // lose Rs.1
            }
            if (cash == goal) wins++;                
        }

        // print results
        System.out.println(wins + " wins of " + trials);
	
        System.out.println("Percent win = " + 100.0 * wins / trials);
        System.out.println("Avg No of bets  = " + 1.0 * bets / trials);
    }


}
