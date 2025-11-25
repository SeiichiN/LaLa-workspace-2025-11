package monsters;

public class DeathBat extends FlyingMonster {

	public DeathBat(String name) {
		super(name);
	}

	@Override
	public void attack(Character c) {
		System.out.println(c.name + "を突っつく");
	}

}
