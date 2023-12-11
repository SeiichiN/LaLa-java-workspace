package main;

import rpg.Place;

public class Main {

	public static void main(String[] args) {
		Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];
		for (int y = 0; y < Const.Y_SIZE; y++) {
			for (int x = 0; x < Const.X_SIZE; x++) {
				places[y][x] = new Place();
			}
		}
	}

}
