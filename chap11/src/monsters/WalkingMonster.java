package monsters;

public abstract class WalkingMonster extends Monster {

	public WalkingMonster(String name) {
		super(name);
	}

	public abstract void attack(Character c);

	@Override
	public void run() {
		System.out.println("トコトコ走って逃げる");
		
	}

}
