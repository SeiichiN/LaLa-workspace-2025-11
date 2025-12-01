package monsters;

import characters.Hero;

public class Goblin {
	private String name;
	private int hp;
	
	public Goblin() {
		this.name = "ゴブリン";
		this.hp = 100;
	}
	
	public String getName() { return this.name; }
	public int getHp() { return this.hp; }
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack(Hero h) {
		System.out.println(this.name + "の反撃");
		System.out.println(h.getName() + "に30ポイントのダメージ");
		h.setHp(h.getHp() - 30);
	}
}
