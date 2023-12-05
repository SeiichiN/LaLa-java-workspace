package util;

import java.util.Random;

import game.Card;

public class CardUtil {
	
	public void setup(Card[] cards) {
		init(cards);
		CardUtil cardUtil = new CardUtil();
		cardUtil.shuffleCard(cards);
//		for (Card card : cards) {
//			System.out.println(card);
//		}
	}
	
	public void init(Card[] cards) {
		final int SUIT_LEN = 13;
		int num = 1;
		for (int i = 0; i < SUIT_LEN; i++) {
			cards[i] = new Card("club", num);
			num++;
		}
		num = 1;
		for (int i = SUIT_LEN; i < SUIT_LEN * 2; i++) {
			
			cards[i] = new Card("spade", num);
			num++;
		}
		num = 1;
		for (int i = SUIT_LEN * 2; i < SUIT_LEN * 3; i++) {
			cards[i] = new Card("heart", num);
			num++;
		}
		num = 1;
		for (int i = SUIT_LEN * 3; i < SUIT_LEN * 4; i++) {
			cards[i] = new Card("heart", num);
			num++;
		}
	}
	
	public void shuffleCard(Card[] cards) {
		int num = cards.length;
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i;
		}
		shuffle(array);
		Card[] newCards = new Card[num];
		for (int i = 0; i < num; i++) {
			newCards[i] = cards[array[i]];
		}
		for (int i = 0; i < num; i++) {
			cards[i] = newCards[i];
		}
	}
	
	public void shuffle(int[] number) {
		for (int i = number.length - 1; i > 0; i--) {
			int r = 0;
			do {
				r = (int) (Math.random() * (i + 1));
			} while (i == r);
			
			int tmp = number[i];
			number[i] = number[r];
			number[r] = tmp;
//			System.out.print("i:" + i + " r:" + r + " " );
//			for (int check : number) {
//				System.out.print(check);
//			}
//			System.out.println();
		}

	}
}
