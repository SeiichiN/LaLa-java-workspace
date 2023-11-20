package memory;

public class MemoryCheck {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		long total = rt.totalMemory();
		long free = rt.freeMemory();
		long max = rt.maxMemory();
		System.out.println("バージョン   : " + Runtime.version());
		System.out.println(String.format("total   : %,d", total));
		System.out.println(String.format("free   : %,d", free));
		System.out.println(String.format("max   : %,d", max));
	}
}

// Javaのヒープサイズとは？メモリの確認・設定方法を把握しよう 
// https://style.potepan.com/articles/35934.html#Java
