package my_random;

import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class MyRandom implements MyRandomGenerator, Serializable {
    @java.io.Serial
    static final long serialVersionUID = 3905348978240129619L;
	
	private final AtomicLong seed = new AtomicLong(8682522807148012L);

    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;
    
    private static final String BAD_BOUND = "bound must be positive";

    private static final double DOUBLE_UNIT = 0x1.0p-53; // 1.0 / (1L << 53)

    @Override
    public long nextLong() {
    	return new Random().nextLong();
    }	
	
    @Override
    public int nextInt(int bound) {
    	return new Random().nextInt(bound);
    }
}
