package main;

public abstract class Monster {
	protected String name;
	protected int hp;
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println(name + " の攻撃！");
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
	public abstract void specialMove();
}
