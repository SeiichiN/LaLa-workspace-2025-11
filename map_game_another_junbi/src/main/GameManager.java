package main;

import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public final int YSIZE;
	public final int XSIZE;
	public char[][] map;
	public int numMonsters = 0;
	private int defeatedMonsters = 0;
	public MoveChar moveChar;
	
	public GameManager(int ysize, int xsize) {
		this.YSIZE = ysize;
		this.XSIZE = xsize;
		this.map = new char[YSIZE][XSIZE];
		initMap();
		this.moveChar = new MoveCharImpl(this);
	}
	
	public GameManager() {
		this(5, 5);
	}
	
	public void initMap() {
		for (int y = 0; y < YSIZE; y++) {
			for (int x = 0; x < XSIZE; x++) {
				this.map[y][x] = '.';
			}
		}
	}
	
	public void setMoveChar(MoveChar moveChar) {
		this.moveChar = moveChar;
	}

	private void setPosition(char ch) {
		Random r = new Random();
		int y, x;
		do {
			y = r.nextInt(YSIZE);
			x = r.nextInt(XSIZE);
		} while(map[y][x] != '.');
		map[y][x] = ch;
	}
	
	public void setMonster(char ch) {
		setPosition(ch);
		numMonsters++;
	}
	
	public void setItem(char ch) {
		this.setPosition(ch);
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
	
	public void attackAndReturn(Player p, Monster m) {
		p.attack(m);
		if (m.hp <= 0) {
			System.out.println(p.name + "は" + m.name + "を倒した!");
			this.defeatedMonsters++;
			this.map[p.py][p.px] = '.';
		} else {
			m.attack(p);
			if (p.hp <= 0) {
				System.out.println(m.name + "は" + p.name + "を倒した!");
				gameOver(p);
			}
		}
	}
	
	public void battleInfo(Player p, Monster m) {
		System.out.println("\n" + p.name + " HP:" + p.hp + " " + m.name + " HP:" + m.hp);
	}
	
	public void battle(Player p) {
		char ch = this.map[p.py][p.px];
		if (ch == '.') return;
		Monster m = null;
		switch (ch) {
		case 'g' -> m = new Goblin();
		case 's' -> m = new Slime();
		}
		while (m.hp > 0 && p.hp > 0) {
			System.out.print("a:攻撃 e:逃げる > ");
			@SuppressWarnings("resource")
			char ch2 = new Scanner(System.in).next().charAt(0);
			if (ch2 == 'a') {
				attackAndReturn(p, m);
			} else if (ch2 == 'e') {
				System.out.println(p.name + "は逃げた!");
				break;
			}
			battleInfo(p, m);
		}	
	}
	
	public boolean isEndCheck() {
		return this.defeatedMonsters >= this.numMonsters;
	}
	
	public void gameOver(Player p) {
		if (p.hp <= 0) {
			System.out.println(p.name + "は倒れた！");
		} else if (isEndCheck()) {
			System.out.println(p.name + "は" + this.defeatedMonsters + "匹のモンスターを倒した!");
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
