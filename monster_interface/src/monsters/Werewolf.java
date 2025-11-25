package monsters;

public class Werewolf extends Monster implements Runnable {

	public Werewolf(String name, Runnable runnable) {
		super(name, runnable);
	}

	@Override
	public void attack(Character c) {
		System.out.println("かみつく");
	}
}
