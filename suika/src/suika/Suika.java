package suika;

import java.util.Random;

public class Suika {
	int x;
	int y;
	
	public Suika() {
		this.x = new Random().nextInt(Const.BOARD_SIZE_X);
		this.y = new Random().nextInt(Const.BOARD_SIZE_Y);
	}
	
	public double getDistance(User user, Suika suika) {
		double y = (double)(suika.y - user.y);
		double x = (double)(suika.x - user.x);
		double dis = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
		return dis;
	}
}
