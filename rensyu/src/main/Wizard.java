package main;

public class Wizard extends Character {

	public Wizard(String name) {
		super(name);
	}

	@Override
	public void attack(Monster m) {
		if (this.hp <= 0) return;
		System.out.println(this.name + "の魔法攻撃");
		System.out.println(m.name + "に10ポイントのダメージ");
		m.hp -= 10;
	}

}
