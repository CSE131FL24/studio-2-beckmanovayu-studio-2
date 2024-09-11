package studio2;

import java.util.Scanner;

public class Ruin {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
		double money = startAmount;
		double a = (1-winChance)/winChance;
		double expected_ruin = 0;
		int wins = 0;
		int total_simulations = 0;
		while (total_simulations>0) {
			if (winChance==0.5) {
				expected_ruin = 1-(startAmount/winLimit);
				System.out.println(expected_ruin);
			}
			else {
				expected_ruin = (Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
				System.out.println(expected_ruin);
			}
			
			while(money>0 && money < winLimit) {
				double number = Math.random();
				if (number> winChance) {
					money ++; 
					wins ++;
				}
				else {
					money --;
				}
				
			}
			if (money>=winLimit) {
				System.out.println("Win");
			}
			else {
				System.out.println("Lose");}
			
			total_simulations --;
		}
		
		
		//printing
		System.out.println(money);
		System.out.println("Simulation " + total_simulations + ": Total Wins: " + wins);
		
		
		
	
	
	}

}
