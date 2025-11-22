package main;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
	public final int YSIZE = 5;
	public final int XSIZE = 5;
	public char[][] map = new char[YSIZE][XSIZE];
	
	public List<Monster> monsters = new ArrayList<>();
	public List<Item> items = new ArrayList<>();
	
	public GameManager() {
		initMap();
	}
	
	public void initMap() {
		for (int y = 0; y < YSIZE; y++) {
			for (int x = 0; x < XSIZE; x++) {
				this.map[y][x] = '.';
			}
		}
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
		System.out.println();
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
	
	public void setItem(Item item) {
		setPosition(item.suffix);
		this.items.add(item);
	}
	
	public Item getItem(Player p) {
		for (Item i : items) {
			if (i.suffix == map[p.py][p.px]) {
				map[p.py][p.px] = '.';
				return i;
			}
		}
		return null;
		
	}
	
	public Monster getMonster(char ch) {
		for (Monster m : monsters) {
			if (m.suffix == ch) {
				return m;
			}
		}
		return null;
	}
	
	public void battle(Player p) {
		char ch = this.map[p.py][p.px];
		Monster m = this.getMonster(ch);
		p.attack(m);
		if (m.hp <= 0) {
			System.out.println(p.name + "は" + m.name + "を倒した!");
			this.monsters.remove(m);
			this.map[p.py][p.px] = '.';
		} else {
			m.attack(p);
			if (p.hp <= 0) {
				System.out.println(m.name + "は" + p.name + "を倒した!");
				gameOver(p);
			}
		}
	}
	
	public void gameOver(Player p) {
		if (p.hp <= 0) {
			System.out.println(p.name + "は倒れた！");
		} 
		String msg = """
				======================
				|     GAME OVER      |
				======================
				""";
		System.out.println(msg);
		System.exit(0);
	}
}
