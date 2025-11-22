package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	public String name = "プレイヤー";
	public int py;
	public int px;
	public final int MAX_HP = 100;
	public int hp = MAX_HP;
	private GameManager gm;
	private List<Item> effects = new ArrayList<>();
	
	public Player(String name, GameManager gm) {
		this.name = name;
		this.gm = gm;
		setRandomPos();
	}
	
	private void setRandomPos() {
		Random r = new Random();
		py = r.nextInt(gm.YSIZE);
		px = r.nextInt(gm.XSIZE);
	}
	
	public void command() {
		System.out.print("wsad:移動 b:戦う t:取る u:使う i:情報 q:終了 > ");
		@SuppressWarnings("resource")
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		switch (ch) {
			case 'w' -> py = Math.max(0, py - 1);
			case 's' -> py = Math.min(gm.YSIZE - 1, py + 1);
			case 'a' -> px = Math.max(0, px - 1);
			case 'd' -> px = Math.min(gm.XSIZE - 1, px + 1);
			case 'b' -> gm.battle(this);
			case 't' -> this.take();
			case 'u' -> this.use();
			case 'i' -> this.printInfo();
			case 'q' -> gm.gameOver(this);
		}
	}
	
	public void printInfo() {
		System.out.println("HP:" + this.hp + "/" + this.MAX_HP);
		printEffects();
	}
	
	public void attack(Monster m) {
		if (this.hp <= 0) return;
		System.out.println("\n" + name + "は" + m.name + "を攻撃した!");
		int damage = new java.util.Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "は" + damage + "のダメージを受けた!");
	}
	
	public void look() {
		char ch = gm.map[py][px];
		String msg = switch(ch) {
		case 'g' -> "ゴブリンが現れた！";
		case 's' -> "スライムが現れた！";
		case 'p' -> "ポーションがあった！";
		default -> "何も見当たらない";
		};
		System.out.println(msg);
	}
	
	public void take() {
		Item item = gm.getItem(this);
		System.out.println(this.name + "は" + item.name + "を手に入れた!");
		this.effects.add(item);
	}
	
	public void printEffects() {
		System.out.print("持ち物: ");
		for (int i = 0; i < effects.size(); i++) {
			System.out.print(i + 1 + ":" + effects.get(i).name + " ");
		}
		System.out.println();
	}
	
	public Item selectItem() {
		printEffects();
		System.out.print("選択>");
		@SuppressWarnings("resource")
		int index = new java.util.Scanner(System.in).nextInt();
		Item item = effects.get(index - 1);
		return item;
	}
	
	public void usePotion(Item item) {
		int nowHP = this.hp;
		if (item instanceof Potion) {
			Potion p = (Potion) item;
			this.hp = Math.min(this.hp + p.recoveryHp, this.MAX_HP);
			System.out.println("HPが" + (this.hp - nowHP) + "回復した!");
			effects.remove(item);
		}
	}
	
	public void use() {
		Item item = selectItem();
		System.out.println(this.name + "は" + item.name + "を使った!");
		switch (item.suffix) {
		case 'p' -> usePotion(item);
		}
	}
	
}
