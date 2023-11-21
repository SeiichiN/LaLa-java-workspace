package type;

import java.util.Scanner;

public class TypeChange {
	public static void main(String[] args) {
		System.out.println("入力 > ");
		char a = new Scanner(System.in).next().charAt(0);
		int ai = a;
		System.out.println("char a: " + a);
		System.out.println("int  a: " + ai);
	}
}
