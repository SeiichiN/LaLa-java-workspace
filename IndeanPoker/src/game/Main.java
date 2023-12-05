package game;

import util.CardUtil;

public class Main {

	public static void main(String[] args) {
		Card[] baseCards = new Card[52];
		init(baseCards);
		CardUtil cardUtil = new CardUtil();
		Card[] cards = cardUtil.shuffleCard(baseCards);
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public static void init(Card[] cards) {
		final int SUIT_LEN = 13;
		for (int i = 0; i < SUIT_LEN; i++) {
			cards[i] = new Card("club", i+1);
		}
		for (int i = SUIT_LEN; i < SUIT_LEN * 2; i++) {
			cards[i] = new Card("spade", i+1);
		}
		for (int i = SUIT_LEN * 2; i < SUIT_LEN * 3; i++) {
			cards[i] = new Card("heart", i+1);
		}
		for (int i = SUIT_LEN * 3; i < SUIT_LEN * 4; i++) {
			cards[i] = new Card("heart", i+1);
		}
	}
}
