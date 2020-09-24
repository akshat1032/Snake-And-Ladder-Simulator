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
		int option = -1;
		
		System.out.println("Start position : "+position);
				
		//Die Rolling
		while (dieRoll == 0) {
			
			dieRoll = (int)(Math.floor(Math.random() * 10) % 7);
		}
		
		option = (int)(Math.floor(Math.random() * 10) % 3);
		
		//Checking For Option of No Play, Snake or Ladder
		switch(option) {
		
		case IS_LADDER:
			position = position + dieRoll;
			break;
		case IS_SNAKE:
			position = position - dieRoll;
			break;
		default:
			position = position - 0; // No change in position
		}
	}

}
