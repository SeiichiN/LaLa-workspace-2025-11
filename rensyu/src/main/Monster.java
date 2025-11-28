package main;

public abstract class Monster {
	String name;
	int hp = 100;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public abstract void attack(Character c);
	
	public abstract void run();
}
