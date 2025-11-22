package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager {
	public final int YSIZE = 5;
	public final int XSIZE = 5;
	public char[][] map = new char[YSIZE][XSIZE];
	
	public List<Monster> monsters = new ArrayList<>();
	public List<Item> items = new ArrayList<>();
	private int numOfDefeatedMonsters = 0;

	
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
		Random r = new Random();
		int y, x;
		do {
			y = r.nextInt(YSIZE);
			x = r.nextInt(XSIZE);
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
			this.numOfDefeatedMonsters++;
			this.map[p.py][p.px] = '.';
		} else {
			m.attack(p);
			if (p.hp <= 0) {
				System.out.println(m.name + "は" + p.name + "を倒した!");
				gameOver(p);
			}
		}
	}
	
	public boolean isEndCheck() {
		return this.monsters.isEmpty();
	}
	
	public void gameOver(Player p) {
		if (p.hp <= 0) {
			System.out.println(p.name + "は倒れた！");
		} else if (this.monsters.isEmpty()) {
			System.out.println(p.name + "は" + this.numOfDefeatedMonsters + "匹のモンスターを倒した!");
			System.out.println(p.name + "は勝利した!");
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
