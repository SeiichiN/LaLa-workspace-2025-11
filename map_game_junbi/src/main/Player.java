package main;

public class Player {
	public String name = "プレイヤー";
	public int py;
	public int px;
	public int hp = 100;
	private GameManager gm;
	
	public Player(String name, GameManager gm) {
		this.name = name;
		this.gm = gm;
		setRandomPos();
	}
	
	private void setRandomPos() {
		py = new java.util.Random().nextInt(gm.YSIZE);
		px = new java.util.Random().nextInt(gm.XSIZE);
	}
	
	public void command() {
		System.out.print("wsad > ");
		@SuppressWarnings("resource")
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		switch (ch) {
			case 'w' -> {
				py = Math.max(0, py - 1);
			}
			case 's' -> {
				py = Math.min(gm.YSIZE - 1, py + 1);
			}
			case 'a' -> {
				px = Math.max(0, px - 1);
			}
			case 'd' -> {
				px = Math.min(gm.XSIZE - 1, px + 1);
			}
			case 'b' -> {
				battle();
			}
		}
	}
	
	public void monster2player(Monster m) {
		this.attack(m);
		if (m.hp <= 0) {
			System.out.println(this.name + "は" + m.type + "を倒した!");
			this.gm.monsters.remove(m);
			gm.map[py][px] = '.';
		} else {
			m.attack(this);
			if (hp <= 0) {
				// gameOver();
			}
		}
	}
	
	public void player2monster(Monster m) {
		m.attack(this);
		if (hp <= 0) {
			// gameOver();
		} else {
			this.attack(m);
		}
	}
	
	public void battle() {
		char m = gm.map[py][px];
		Monster monster = gm.getMonster(m);
		int num = new java.util.Random().nextInt(100);
		if (num % 2 == 0) {
			monster2player(monster);
		} else {
		}
	}
	
	public void attack(Monster m) {
		System.out.println(name + "は" + m.type + "を攻撃した!");
		int damage = new java.util.Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.type + "は" + damage + "のダメージを受けた!");
	}
}
