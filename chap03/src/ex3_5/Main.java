package ex3_5;

public class Main {

	public static void main(String[] args) {
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");
		int selected = new java.util.Scanner(System.in).nextInt();
		String msg = null;
		switch (selected) {
		case 1:
			msg = "検索します";
			break;
		case 2:
			msg = "登録します";
			break;
		case 3:
			msg = "削除します";
			break;
		case 4:
			msg = "変更します";
			break;
		default:
			
		}
		System.out.println(msg);

	}

}
