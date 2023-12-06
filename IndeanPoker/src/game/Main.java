package game;

import java.util.Scanner;

import util.CardUtil;

public class Main {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		CardUtil util = new CardUtil();
		util.setup(cards);
		
		Player com = new Player("コム");
		Player user = new Player("ユーザー");

		Card[] select3 = util.take3card(cards);
		
		com.card = select3[0];
		user.card = select3[1];
		
		String yesno = dousuru(com);
		if (yesno.equals("y")) {
			user.card = select3[2];
		}
		
		
		com.judge(user);
		user.judge(com);
		System.out.println(com);
		System.out.println(user);
	}

	private static String dousuru(Player target) {
		System.out.println("相手のカード:" + target.card);
		String yesno = null;
		do {
			System.out.println("もう一枚カードをひきますか？ (y/n)");
			yesno = new Scanner(System.in).nextLine().toLowerCase();
		} while (!yesno.equals("y") && !yesno.equals("n"));
		return yesno;
	}
}
