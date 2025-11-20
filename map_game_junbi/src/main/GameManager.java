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
	
	public void p2m(Player p, Monster m) {
		p.attack(m);
		if (m.hp <= 0) {
			System.out.println(p.name + "は" + m.type + "を倒した!");
			this.monsters.remove(m);
			this.map[p.py][p.px] = '.';
		} else {
			m.attack(p);
			if (p.hp <= 0) {
				System.out.println(m.type + "は" + p.name + "を倒した!");
				gameOver(p);
			}
		}
	}
	
	public void m2p(Monster m, Player p) {
		m.attack(p);
		if (p.hp <= 0) {
			System.out.println(m.type + "は" + p.name + "を倒した!");
			gameOver(p);
		} else {
			p.attack(m);
			if (m.hp <= 0) {
				System.out.println(p.name + "は" + m.type + "を倒した!");
				this.monsters.remove(m);
				this.map[p.py][p.px] = '.';
			}
		}
	}
	
	public void battle(Player p) {
		char m = this.map[p.py][p.px];
		Monster monster = this.getMonster(m);
		int num = new java.util.Random().nextInt(100);
		if (num % 2 == 0) {
			m2p(monster, p);
		} else {
			p2m(p, monster);
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
