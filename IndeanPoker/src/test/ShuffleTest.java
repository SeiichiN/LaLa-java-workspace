package test;

public class ShuffleTest {

	public static void main(String[] args) {
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = number.length - 1; i > 0; i--) {
			int r = 0;
			do {
				r = (int) (Math.random() * (i + 1));
			} while (i == r);
			
			int tmp = number[i];
			number[i] = number[r];
			number[r] = tmp;
			System.out.print("i:" + i + " r:" + r + " " );
			for (int check : number) {
				System.out.print(check);
			}
			System.out.println();
		}

	}

}
