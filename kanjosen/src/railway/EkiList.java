package railway;

public class EkiList {
	
	Eki head = new Eki(null);
	
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
	}
	
	public void add(String name) {
		Eki eki = head;
		while (eki.next != null) {
			eki = eki.next;
		}
		Eki newEki = new Eki(name);
		eki.next = newEki;
		newEki.prev = eki;
	}
	
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
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Eki eki = head;
		while(eki.next != null) {
			eki = eki.next;
			sb.append(eki.name + "\n");
		}
		return sb.toString();
	}
}
