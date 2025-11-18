package main;

public class Main {

	public static void main(String[] args) {
		char[][] map = {
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'}
		};
		int y, x;
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 'g';
		
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 's';
		
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 'p';
		
		for (y = 0; y < 5; y++) {
			for (x = 0; x < 5; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
		}
		
	}

}
