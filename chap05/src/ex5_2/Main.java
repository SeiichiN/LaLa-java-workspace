package ex5_2;

public class Main {
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名: 無題");
		System.out.println("本文:" + text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	public static void main(String[] args) {
		String title = "お久しぶりです";
		String address = "taro@gmail.com";
		String text = "三ヶ月ぶりに出張から帰ってきました。";
		email(title, address, text);

	}

}
