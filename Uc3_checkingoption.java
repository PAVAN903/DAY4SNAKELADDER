package com.snakeladder;

import java.util.Random;

public class Uc3_checkingoption {

	public static void main(String[] args) {
		int dice=1;
		int player=0;
		Random random=new Random();
		dice=random.nextInt(6)+1;
		System.out.println("dice roll:: " +dice);
		
		//for postion moved by diceroll
		int option;
		Random random1=new Random();
		option=random1.nextInt(2);
		
		if(option==0) {
			System.out.println("player stays in the same position:: " +option);
		}
		if(option==1) {
			System.out.println("player moves ahead by the\r\n"
					+ "number of position received in the die::" +option);
		}
		if(option==2) {
			System.out.println("player moves behind by the number of position recieved by the dice::" +option);
		}
		
		

	}

}
