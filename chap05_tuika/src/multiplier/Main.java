package multiplier;

public class Main {
	public static int multiply(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		int ans = multiply(-3, 5);
		System.out.println(ans == -15);
		
	}

}
