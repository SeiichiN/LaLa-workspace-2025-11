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
	private List<Item> items = new ArrayList<>();
	
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
		System.out.print("wsad:移動 b:戦う t:取る u:使う  q:終了 > ");
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
				gm.battle(this);
			}
			case 't' -> {
				this.take();
			}
			case 'u' -> {
				this.selectItem();
			}
			case 'q' -> {
				gm.gameOver(this);
			}
		}
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
		this.items.add(item);
	}
	
	public void selectItem() {
		System.out.print("アイテム:");
		for (int i = 0; i < items.size(); i++) {
			System.out.print(i+1 + ":" + items.get(i).name + " ");
		}
		System.out.println();
		System.out.print("選択>");
		int index = new java.util.Scanner(System.in).nextInt();
		Item item = items.get(index - 1);
		use(item);
	}
	
	public void use(Item item) {
		System.out.println(this.name + "は" + item.name + "を使った!");
		if (item.suffix == 'p') {
			int nowHP = this.hp;
			Potion p = (Potion) item;
			this.hp = Math.min(this.hp + p.recoveryHp, this.MAX_HP);
			System.out.println("HPが" + (this.hp - nowHP) + "回復した!");
		}
	}
	
}
