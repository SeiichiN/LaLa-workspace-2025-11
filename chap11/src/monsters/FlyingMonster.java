package monsters;

public abstract class FlyingMonster extends Monster {
	
	public FlyingMonster(String name) {
		super(name);
	}
	
	public abstract void attack(Character c);
	
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
