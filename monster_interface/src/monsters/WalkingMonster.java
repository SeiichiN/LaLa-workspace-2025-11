package monsters;

public abstract class WalkingMonster extends Monster {

	public WalkingMonster(String name, Runnable runnable) {
		super(name, runnable);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public abstract void attack(Character c);

}
