package util;

import java.util.Random;

import game.Card;

public class CardUtil {
	public Card[] shuffleCard(Card[] cards) {
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
		return newCards;
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
