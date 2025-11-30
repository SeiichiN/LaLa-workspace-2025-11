package main;

public class Slime extends Monster {
	public Slime() {
		super("スライム", 15);
	}

	@Override
	public void specialMove() {
		System.out.println(this.name + " は体当たりした!");			
	}

}
