package main;

public class Hero {
	String name;
	int hp;
	Movable movable;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.movable = new WalkMove(); 
	}
	
	public void move() {
		this.movable.move();
	}
	
	public void setMovable(Movable movable) {
		this.movable = movable;
	}
}
