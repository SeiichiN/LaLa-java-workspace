package jp.co.pana.main;

public class Main {

	public static void main(String[] args) {
		User user = new User("太郎");
		Com com = new Com("コム");
		while (true) {
			user.setHand();
			if (user.hand == 9) { break; }
			com.setHand();
			user.judge(com);
			com.judge(user);
			System.out.println(user);
			System.out.println(com);
		}
		System.out.println("bye");
	}

}
