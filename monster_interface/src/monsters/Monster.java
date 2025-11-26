package monsters;

public abstract class Monster implements Runnable {
	String name;
	int hp = 100;
	int mp = 50;
	Runnable runnable;
	
	public Monster(String name) {
		this.name = name;
		this.runnable = new NormalRun();
	}
	
	public abstract void attack(Character c);
	
	public void run() {
		runnable.run();
	}
	
	public void setRunnable(Runnable runnable) {
		this.runnable = runnable;
	}
}
