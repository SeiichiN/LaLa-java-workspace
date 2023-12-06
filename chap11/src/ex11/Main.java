package ex11;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("スッキリ", 2000, "白", "1111");
		Computer com = new Computer("pc", 100000, "黒", "sony");
		System.out.println(book.getName() + ":" + book.getPrice());
		System.out.println(com.getName() + ":" + com.getPrice());
	}

}
