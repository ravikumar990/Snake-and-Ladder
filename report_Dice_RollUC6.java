package com.snackladder;

public class report_Dice_RollUC6 {
	public static final int WINNING_POSITION = 100;
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Program");
		int startPosition = 0;
		System.out.println("Player staring position is : " + startPosition);

		int position = 0;
		int diceRollCount = 0;

		while (position < WINNING_POSITION) {

			int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("diceNumber : " + diceNumber);

			int option = (int) Math.floor(Math.random() * 10) % 2;
			System.out.println("selected player option : " + option);
			diceRollCount++;

			if (option == IS_LADDER) {
				position = position + diceNumber;
				if (position > 100) {
					position = 100;
					position = position - diceNumber;
				}
				System.out.println("player Position after the ladder : " + position);
			} else if (option == IS_SNAKE) {
				position = position - diceNumber;
				if (position < 0) {
					position = 0;
				}
				System.out.println("player Position after the snake is : " + position);
			}
		}
		System.out.println("Total dice count = " + diceRollCount);
	}

}
