package monsters;

public class Goblin extends Monster implements Runnable {
	
	public Goblin(String name, Runnable runnable) {
		super(name, runnable);
	}

	@Override
	public void attack(Character c) {
		System.out.println("ナイフで斬りつける");
	}
}
