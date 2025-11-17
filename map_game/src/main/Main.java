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
		// goblin
		int y = new java.util.Random().nextInt(5);
		int x = new java.util.Random().nextInt(5);
		map[y][x] = 'g';
		
		y = new java.util.Random().nextInt(5);
		x = new java.util.Random().nextInt(5);
		map[y][x] = 's';
		
		y = new java.util.Random().nextInt(5);
		x = new java.util.Random().nextInt(5);
		map[y][x] = 'p';
		
		for (y = 0; y < 5; y++) {
			System.out.print("|");
			for (x = 0; x < 5; x++) {
				System.out.print(map[y][x] + "|");
			}
			System.out.println();
		}
	}

}
