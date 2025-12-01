package characters;

import monsters.Goblin;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;
	
	public Hero() {
		this.name = "ミナト";
		this.hp = 100;
		this.sword = new Sword();
	}
	
	public void setName(String name) {
		if (name == null) { 
			System.out.println("名前がnullである。処理を中断。");
			return;
		}
		if (name.length() <= 1) {
			System.out.println("名前が短すぎる。処理を中断。");
			return;
		}
		if (name.length() >= 8)  {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public int getHp() { return this.hp; }
	public String getName() { return this.name; }
	public Sword getSword() { return this.sword; }
	
	public void setHp(int hp) { this.hp = hp;	}
	// public void setName(String name) {	this.name = name; }
	public void setSword(Sword sword) { this.sword = sword; }
	
	public void attack(Goblin g) {
		System.out.println(this.name + "の攻撃");
		System.out.println(g.getName() + "に30ポイントのダメージ");
		g.setHp(g.getHp() - 30);
	}
	
	private void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
}
