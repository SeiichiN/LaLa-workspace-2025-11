package main;

public class Hero {
	private int hp;
	public String name;
	Sword sword;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
}
