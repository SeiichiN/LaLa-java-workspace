package buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetString {

	public static void main(String[] args) {
		String str = input();
		System.out.println("str:" + str);
	}

	public static String input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力 > ");
		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			throw new IllegalArgumentException("キーボードがおかしい");
		}
		return str;
	}
}
