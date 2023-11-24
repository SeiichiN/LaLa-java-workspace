package p156;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60, 70};

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点" + avg);

	}

}
