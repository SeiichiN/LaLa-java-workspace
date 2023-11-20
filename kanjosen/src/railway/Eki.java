package railway;

import java.util.Objects;

public class Eki {
	String name;
	Eki next = null;
	Eki prev = null;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eki other = (Eki) obj;
		return Objects.equals(name, other.name);
	}

	public Eki(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
