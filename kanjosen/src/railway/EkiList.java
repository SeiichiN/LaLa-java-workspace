package railway;

public class EkiList {
	// 最初 EkiList のインスタンスを生成したときは、
	// この head には、next も prev も null である
	// Eki インスタンスが代入されている。
	// しかし、EkiListがadd()コマンドにより生成されてのちは
	// この head には、next には歳1番目の Eki インスタンスが
	// 代入されている。
	private Eki head = new Eki(null);
	private int length = 0;
	
	public Eki get(String name) {
		Eki eki = head;
		while (eki.next != null) {
			eki = eki.next;
			if (eki.name.equals(name)) {
				return eki;
			}
		}
		return null;
	}

	public void add(int num, String name) {
		int i = 0;
		Eki eki = head;
		while (i < num) {
			eki = eki.next;
			i++;
		}
		// System.out.println(eki.next.name);
		Eki nextEki = eki.next;
		eki.next = new Eki(name);
		eki.next.next = nextEki;
		this.length++;
	}
	
	public void add(String name) {
		Eki eki = head;
		while (eki.next != null) {
			eki = eki.next;
		}
		Eki newEki = new Eki(name);
		eki.next = newEki;
		newEki.prev = eki;
		this.length++;
	}
	
	public int size() {
		return this.length;
	}
	
	/**
	 * ekilist.add(福島) のあとで、ekilist.close("大阪") とすれば、
	 * ekilistは閉じられる。
	 * @param name
	 */
	public void close(String name) {
		Eki eki = head;
		while (eki.next != null) {
			eki = eki.next;
		}
		Eki end = get(name);
		eki.next = end;
		end.prev = eki;
		
	}
	
	public void remove(String name) {
		Eki eki = head;
		while (!eki.next.name.equals(name)) {
			eki = eki.next;
		}
		// System.out.println(eki.name);
		Eki nextEki = eki.next.next;
		eki.next = nextEki;
		this.length--;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Eki eki = head;
		String headNextName = eki.next.name;
		while(eki.next != null) {
			eki = eki.next;
			sb.append(eki.name + " ");
			if (eki.next.name.equals(headNextName)) break;
		}
		return sb.toString();
	}
}
