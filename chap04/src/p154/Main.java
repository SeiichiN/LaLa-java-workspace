package p154;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		int sum = scores[1] + scores[2] +
				scores[3] + scores[4] + scores[0];
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点" + avg);

	}

}
