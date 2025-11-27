package use_interface;

public abstract class Monster {
	String name;
	int hp = 100;
	int mp = 50;
	Runnable runnable;
	
	public Monster(String name) {
		this.name = name;
	}
	
	// public abstract void attack();
	
	public void setRunnable(Runnable runnable) {
		this.runnable = runnable;
	}
	
	public void run() {
		this.runnable.run();
	}
}
