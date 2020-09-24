package com.capgemini.snakeandladdersimulator;

public class SnakeAndLadderSimulator {
	
	//Constants
	public static final int IS_NO_PLAY = 0;
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	
	public static void main(String[] args) {
		
		//Variable
		int position = 0;
		int dieRoll = 0;
		int option = 0;
		int dieRollCount = 0;
		
		System.out.println("Start position : "+position);
		
		while (position < 100) {
				
			//Die Rolling
			while (true) {
			
				dieRoll = (int)(Math.floor(Math.random() * 10) % 7);
				if (dieRoll == 0)
					continue;
				else
					break;
			}
			
			dieRollCount = dieRollCount + 1;
			option = (int)(Math.floor(Math.random() * 10) % 3);
		
			//Checking For Option of No Play, Snake or Ladder
			switch(option) {
			
			case IS_NO_PLAY:
				position = position - 0;
				break;
			case IS_LADDER:
				position = position + dieRoll;
				if (position > 100) {
					
					position = position - dieRoll;
				}
				break;
			case IS_SNAKE:
				position = position - dieRoll;
				if (position < 0) {
					
					position = 0;
				}
				break;
			default:
				System.exit(0);
			}
			System.out.println("Current position : "+position);
		}
		System.out.println("The number of times die was played : "+dieRollCount);
	}
}
