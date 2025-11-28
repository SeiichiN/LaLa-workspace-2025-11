package main;

public class Slime extends Monster {

	public Slime(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.name + "はくねくねと逃げ出した");
	}
	@Override
	public void attack(Character c) {
		if (this.hp <= 0) return;
		System.out.println(this.name + "の毒反撃");
		System.out.println(c.name + "に5ポイントのダメージ");
		c.hp -= 5;
	}

}
