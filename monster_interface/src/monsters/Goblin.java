package monsters;

public class Goblin extends WalkingMonster {
	
	public Goblin(String name) {
		super(name);
	}

	@Override
	public void attack(Character c) {
		System.out.println("ナイフで斬りつける");
	}
}
