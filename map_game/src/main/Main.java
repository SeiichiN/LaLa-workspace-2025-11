package main;

public class Main {

	public static void setPosition(char ch, char[][] map) {
		int y, x;
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = ch;
	}

	public static void printMap(char[][] map) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
		}
		
	}
	
	public static void main(String[] args) {
		char[][] map = {
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'}
		};
		setPosition('g', map);
		setPosition('s', map);
		setPosition('p', map);
		printMap(map);
		
	}

}
