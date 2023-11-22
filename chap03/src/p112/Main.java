package p112;

public class Main {

	public static void main(String[] args) {
		String str1 = "夕日";
		String str2 = "夕日";
		System.out.println("夕日と入力してね");
		String str3 = new java.util.Scanner(System.in).nextLine();
		if (str1.equals(str3)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}

	}

}
