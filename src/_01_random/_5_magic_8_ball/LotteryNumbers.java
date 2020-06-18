package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random ran = new Random();
	int Number1 = ran.nextInt(99);
	int Number2 = ran.nextInt(99);
	int Number3 = ran.nextInt(99);
	int Number4 = ran.nextInt(99);
	int Number5 = ran.nextInt(99);
	int Number6 = ran.nextInt(99);
	JOptionPane.showMessageDialog(null, Number1 + " , " + Number2 + " , " + Number3 + " , " + Number4 + " , " + Number5 + " , " + Number6);
}
}
