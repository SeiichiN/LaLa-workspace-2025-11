package main;

public class Goblin extends Monster {

	public Goblin(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.name + "は腕をふって逃げ出した");
	}

	@Override
	public void attack(Character c) {
		if (this.hp <= 0) return;
		System.out.println(this.name + "の反撃");
		System.out.println(c.name + "に10ポイントのダメージ");
		c.hp -= 10;
	}

}
