package rpg;

public class Main2 {

	public static void main(String[] args) {
		String s1 = "wahaha";
		String s2 = s1;   // s1の先頭アドレス
		System.out.println(s2);  // "wahaha"
		s2 = "ehehe";    // "ehehe"の先頭アドレスを代入
		System.out.println(s1);  // "wahaha"
		
		Hero h1 = new Hero("ミナト");
		h1.hp = 100;
		Hero h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);  // 200

	}

}
