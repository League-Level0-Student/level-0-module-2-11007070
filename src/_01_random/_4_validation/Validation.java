//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			System.out.println("Your hair looks good today!");
		}
		else if (randomNumber == 2) {
			System.out.println("You're very brave!");
		}
		else if (randomNumber == 3) {
			System.out.println("You're very kind!");
		}
		else if (randomNumber == 4) {
			System.out.println("You have great manners!");
		}
		else {
			System.out.println("You're very helpful!");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
