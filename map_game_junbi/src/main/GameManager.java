package main;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Monster> monsters = new ArrayList<>();
	
	public GameManager() {}

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
	
	public void setMonster(Monster m) {
		setPosition(m.suffix);
		this.monsters.add(m);
	}
	
	public Monster getMonster(char ch) {
		for (Monster m : monsters) {
			if (m.suffix == ch) {
				return m;
			}
		}
		return null;
	}
}
