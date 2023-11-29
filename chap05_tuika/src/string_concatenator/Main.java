package string_concatenator;

public class Main {
	public static String concatenate(String str1, String str2) {
		return str1 + str2;
	}

	public static void main(String[] args) {
		String ans = concatenate("太郎さん", "こんにちは");
		System.out.println(ans.equals("太郎さんこんにちは"));
	}

}
