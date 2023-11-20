package railway;

import java.util.Scanner;

public class Main {
	static EkiList ekiList;
	
	public static void main(String[] args) {
		init();
		
		ekiList.add(6, "玉造");

		// ekiList.remove("京橋");
		// System.out.println(ekiList);

		dispEki();
	}
	
	private static void dispEki() {
		System.out.println("表示したい駅名を入力");
		String ekiKanji = new Scanner(System.in).nextLine();
		Eki tgt = ekiList.get(ekiKanji);
		System.out.println(tgt.name);
		while (true) {
			System.out.println("p:前 n:次 q:終>");
			String w = new Scanner(System.in).nextLine().toLowerCase();
			if (w.equals("p")) {
				tgt = tgt.prev;
				System.out.println(tgt);
			} else if (w.equals("n")) {
				tgt = tgt.next;
				System.out.println(tgt);
			} else if (w.equals("q")) {
				break;
			}
		}
		System.out.println("Bye!");
	}

	private static void init() {
		ekiList = new EkiList();
		ekiList.add("大阪");
		ekiList.add("天満");
		ekiList.add("桜ノ宮");
		ekiList.add("京橋");
		ekiList.add("大阪城公園");
		ekiList.add("森ノ宮");
		ekiList.add("鶴橋");
		ekiList.add("桃谷");
		ekiList.add("寺田町");
		ekiList.add("天王寺");
		ekiList.add("新今宮");
		ekiList.add("今宮");
		ekiList.add("芦原橋");
		ekiList.add("大正");
		ekiList.add("弁天町");
		ekiList.add("西九条");
		ekiList.add("野田");
		ekiList.add("福島");
		ekiList.close("大阪");
	}
}
