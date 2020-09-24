package com.capgemini.snakeandladdersimulator;

public class SnakeAndLadderSimulator {
	
	//Constants
	public static final int IS_NO_PLAY = 0;
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	
	public static void main(String[] args) {
		
		//Variable
		int positionPlayerOne = 0;
		int positionPlayerTwo = 0;
		int position = 0;
		int dieRoll = 0;
		int option = 0;
		int playerCount = 0;
		
		System.out.println("Start position for Player One : "+positionPlayerOne);
		System.out.println("Start position for Player Two : "+positionPlayerTwo);
				
		while (position < 100) {
			
			playerCount++;
			
			//Die Rolling
			while (true) {
			
				dieRoll = (int)(Math.floor(Math.random() * 10) % 7);
				if (dieRoll == 0)
					continue;
				else
					break;
			}
			
			option = (int)(Math.floor(Math.random() * 10) % 3);
		
			//Checking For Option of No Play, Snake or Ladder
			switch(option) {
			
			case IS_NO_PLAY:
				position = position - 0;
				break;
			case IS_LADDER:
				playerCount--;
				position = position + dieRoll;
				if (position == 100)
					break;
				else if (position > 100) {
					
					position = position - dieRoll;
				}
				continue;
			case IS_SNAKE:
				position = position - dieRoll;
				if (position < 0) {
					
					position = 0;
				}
				break;
			default:
				System.exit(0);
			}
			if (playerCount % 2 == 0) {
				positionPlayerTwo = position;
				position = positionPlayerOne;
				playerCount = 0;
			}
			else {
				positionPlayerOne = position;
				position = positionPlayerTwo;
				playerCount = 1;
			}
		}
		if (positionPlayerOne == 100) {
			System.out.println("Player One Wins");
		} 
		else if(positionPlayerTwo == 100) {
			System.out.println("Player Two Wins");
		}
		System.out.println("Final position of Player One : "+ positionPlayerOne);
		System.out.println("Final position of Player Two : "+ positionPlayerTwo);
	}
}
