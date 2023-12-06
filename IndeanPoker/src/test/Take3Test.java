package test;

import java.util.Random;

import game.Card;
import util.CardUtil;

public class Take3Test {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		CardUtil util = new CardUtil();
		util.setup(cards);
		Card[] select3 = take3card(cards);
		for (Card card : select3) {
			System.out.println(card);
		}
	}
	
	/**
	 * 1組52枚のカードからランダムに3枚のカードを取得する
	 * @param cards 1組のカード
	 * @return 3枚のカードの配列
	 */
	public static Card[] take3card(Card[] cards) {
		Card[] take3 = new Card[3];
		int num1, num2, num3;
		num1 = new Random().nextInt(cards.length);
		do {
			num2 = new Random().nextInt(cards.length);
		} while (num2 == num1);
		do {
			num3 = new Random().nextInt(cards.length);
		} while (num3 == num1 || num3 == num1);
		return new Card[] {cards[num1], cards[num2], cards[num3]};
	}
}
