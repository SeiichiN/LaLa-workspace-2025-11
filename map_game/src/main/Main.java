package main;

public class Main {
	static char[][] map = {
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '.'}
	};
	
	public static void setPosition(char c) {
		int y, x;
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = c;		
	}
	
	public static void printMap() {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
		}		
	}

	public static void main(String[] args) {


		setPosition('g');
		setPosition('s');
		setPosition('p');
		
		printMap();
		
	}

}
