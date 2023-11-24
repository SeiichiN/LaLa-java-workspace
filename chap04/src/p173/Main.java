package p173;

public class Main {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 70;
		scores[1][2] = 60;
		for (int[] array : scores) {
			for (int v : array) {
				System.out.println(v);
			}
		}
		System.out.println("------------------------------");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);
			}
		}
	}

}
