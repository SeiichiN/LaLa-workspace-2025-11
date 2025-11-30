package main;

public class Goblin extends Monster {
	public Goblin() {
		super("ゴブリン", 20);
	}
	
	@Override
	public void specialMove() {
		System.out.println(this.name + " は短剣で切りかかった!");
	}

}
