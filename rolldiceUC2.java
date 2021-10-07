package com.snackladder;

public class rolldiceUC2 {
	public static void main(String[] args) {

		// to roll a dice
		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("diceNumber is : " + diceNumber);

	}

}
