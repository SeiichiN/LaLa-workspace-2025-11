package main;

public class GameManager {
	public final int YSIZE;
	public final int XSIZE;
	char[][] map;

	GameManager(int ysize, int xsize) {
		YSIZE = ysize;
		XSIZE = xsize;
		map = new char[YSIZE][XSIZE];
		initMap();
	}
	
	public void initMap() {
		for (int y = 0; y < YSIZE; y++) {
			for (int x = 0; x < XSIZE; x++) {
				this.map[y][x] = '.';
			}
		}
	}
	
	public void setPosition(char c) {
		int y, x;
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = c;		
	}
	
	public void printMap() {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
		}		
	}
}
