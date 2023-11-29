package find_max;

public class Main {
	/**
	 * Integer.max(int a, int b) -- 大きいほうを返す
	 * Math.max(int a, int b) -- 大きいほうを返す
	 */
	public static int findMax(int x, int y, int z) {
		return Math.max(Math.max(x, y), z);
	}
	
	public static int findMax2(int a, int b, int c) {
		int result = a;
		if (result < b) {
			result = b;
		}
		if (result < c) {
			result = c;
		}
		return result;
	}

	public static void main(String[] args) {
		int ans = findMax2(6, 4, -5);
		System.out.println(ans == 6);

	}

}
