package railway;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> ekiList = 
				new LinkedList<String>(Arrays.asList("大阪", "天満", "桜宮", "京橋"));
		ekiList.add("森ノ宮");
		ekiList.add(4, "大阪城公園");
		System.out.println(ekiList);
	}

}
