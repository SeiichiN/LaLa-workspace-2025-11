package main;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(Wand wand) {
		setWand(wand);
	}
	
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		  (h.getName() + "のHPを" + recovPoint + "回復した");
	}
	
	public void setHp(int hp) {
		if (hp < 0) { hp = 0;}
		this.hp = hp;
	}
	public int getHp() { return this.hp; }
	
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			  ("MPが 0 より小さいです。");
		}
		this.mp = mp;
	}
	
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException
			  ("魔法使いの名前が短すぎる。");
		}
		this.name = name;
	}
	
	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
