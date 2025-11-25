package ex10_3;

public class PoisonMatango extends Matango {
	int remain;

	public PoisonMatango(char suffix) {
		super(suffix);
		this.remain = 3;
	}
	
	@Override
	public void attack(Hero h) {
		super.attack(h);
		if (remain > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			remain--;
		}
	}

}
