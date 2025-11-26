package monsters;

public class Werewolf extends WalkingMonster {

	public Werewolf(String name) {
		super(name);
	}

	@Override
	public void attack(Character c) {
		System.out.println("かみつく");
	}
}
