package janken;

public class Main {
	public static int getComHand() {
		return new java.util.Random().nextInt(3);
	}
	
	public static int getUserHand() {
		System.out.println("0:グー 1:チョキ: 2:パー");
		return new java.util.Scanner(System.in).nextInt();
	}

	public static void showResult(int user, int com) {
		String[] hand = {"グー", "チョキ", "パー"};
		System.out.println("user:" + hand[user] + " com:" + hand[com]);
		if (user == com) {
			System.out.println("ひきわけ");
		} else if ((user + 1) % 3 == com) {
			System.out.println("userの勝ち");
		} else {
			System.out.println("comの勝ち");
		}
	}
	
	public static void main(String[] args) {
		int com = getComHand();    // 0, 1, 2
		int user = getUserHand();  // 0, 1, 2
	    showResult(user, com);
	}

}
