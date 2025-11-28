package main;

public abstract class Character {
	String name;
	int hp = 100;
	
	public Character(String name) {
		this.name = name;
	}
	
	public abstract void attack(Monster m);
}
