package nuk_1;

/**
 * 新しいクラス Multiplier を作成し、その中に multiply というメソッドを実装してください。
 * このメソッドは2つの整数を受け取り、それらを掛け算して結果を返すものです。
 */
public class Multiplier {
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		int ans1 = multiply(3, 5);
		System.out.println(ans1 == 15);
		int ans2 = multiply(-4, 7);
		System.out.println(ans2 == -28);
	}

}
