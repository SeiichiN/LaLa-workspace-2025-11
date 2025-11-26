package monsters;

public abstract class WalkingMonster extends Monster {

	public WalkingMonster(String name) {
		super(name);
	}

	@Override
	public abstract void attack(Character c);

}
