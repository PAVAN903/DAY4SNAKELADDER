package com.snakeladder;

import java.util.Random;

public class Uc2_diceroll {

	public static void main(String[] args) {
		int a=1;
		int player=0;
		Random random=new Random();
		a=random.nextInt(6+1);
		System.out.println("Dice roll for postion is :" +a);

	}

}
