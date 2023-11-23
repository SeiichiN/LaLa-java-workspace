package my_random;

public interface MyRandomGenerator {
	default int nextInt() {
		// Long値を32ビット分右にシフトする。つまり8バイトから4バイトにする。
		return (int)(nextLong() >>> 32);
	}
	default int nextInt(int bound) {
        return (int)(Math.floor(Math.random() * bound));
	}
	default int nextInt(int origin, int bound) {
		int _bound = bound - 1;
		return (int)(Math.floor(Math.random() * _bound)) + origin;
	}
    
	long nextLong();
}
