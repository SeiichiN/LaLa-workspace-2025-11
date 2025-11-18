package main;

public class GameManager {
	public final int YSIZE = 5;
	public final int XSIZE = 5;
	public char[][] map = {
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'}
	};
	
	public GameManager() {}

	public char[][] getMap() {
		return map;
	}

	public void setPosition(char ch) {
		int y, x;
		do {
			y = new java.util.Random().nextInt(YSIZE);
			x = new java.util.Random().nextInt(XSIZE);
		} while(map[y][x] != '.');
		map[y][x] = ch;
	}

	public void printMap(Player player) {
		for (int y = 0; y < YSIZE; y++) {
			for (int x = 0; x < XSIZE; x++) {
				System.out.print('|');
				if (player.py == y && player.px == x) {
					System.out.print('@');
				} else {
					System.out.print(map[y][x]);
				}
			}
			System.out.println("|");
		}
		
	}
	

}
