package type;

import java.util.Scanner;

/**
 * ascii文字を入力して、その数値を表示する
 */
public class TypeChange {
	public static void main(String[] args) {
		System.out.println("入力 > ");
		char a = new Scanner(System.in).next().charAt(0);
		int ai = a;
		System.out.println("char: " + a);
		System.out.println("int: " + ai);
	}
}
