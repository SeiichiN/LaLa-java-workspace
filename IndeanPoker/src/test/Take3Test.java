package test;

import java.util.Random;

import game.Card;
import util.CardUtil;

public class Take3Test {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		CardUtil util = new CardUtil();
		util.setup(cards);
		int[] select3 = take3idx(52);
	}
	
	public static int[] take3idx(int max) {
		int[] nums = new int[3];
		nums[0] = new Random().nextInt(max);
		do {
			nums[1] = new Random().nextInt(max);
		} while (nums[1] == nums[0]);
		do {
			nums[2] = new Random().nextInt(max);
		} while (nums[2] == nums[0] || nums[2] == nums[1]);
		return nums;
	}

}
