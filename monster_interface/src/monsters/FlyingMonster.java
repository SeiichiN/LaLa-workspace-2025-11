package monsters;

public abstract class FlyingMonster extends Monster {

	public FlyingMonster(String name) {
		super(name);
	}
	
	@Override
	public abstract void attack(Character c);
}
