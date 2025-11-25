package monsters;

public abstract class Monster {
	String name;
	int hp = 100;
	int mp = 50;
	Runnable runnable;
	
	public Monster(String name, Runnable runnable) {
		this.name = name;
		this.runnable = runnable;
	}
	
	public abstract void attack(Character c);
	
	public void run() {
		runnable.run();
	}
}
