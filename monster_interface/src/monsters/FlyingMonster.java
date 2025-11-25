package monsters;

public abstract class FlyingMonster extends Monster {

	public FlyingMonster(String name, Runnable runnable) {
		super(name, runnable);
	}
	
	@Override
	public abstract void attack(Character c);
}
