package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Character[] chars = new Character[2];
		chars[0] = new Hero("ミナト");
		chars[1] = new Wizard("アサカ");
		Monster[] monsters = new Monster[2];
		monsters[0] = new Goblin("ゴブリン");
		monsters[1] = new Slime("スライム");
		
		Random r = new Random();
		int i = r.nextInt(2);
		int j = r.nextInt(2);
		battle(chars[i], monsters[j]);
		if (chars[i].hp <= 0)  System.out.println("負けた！");
		if (monsters[j].hp <= 0) monsters[j].run();
	}

	public static void battle(Character c, Monster m) {
		while (c.hp > 0 && m.hp > 0) {
			c.attack(m);
			if (m.hp <= 0) break;
			m.attack(c);
		}
	}
}
