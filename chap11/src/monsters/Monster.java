package monsters;

public abstract class Monster {
	String name;
	int hp = 100;
	int mp = 50;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public abstract void attack(Character c);
	
	public abstract void run();
}
