package main;

public class ThiefTest {

	public static void heal(int hp) {
		hp += 10;  // Thiefインスタンスとは無関係
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;  // インスタンス本体のHPフィールド
	}
	
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		heal(t.hp);  // hpの値
		System.out.println(baseHp + " : " + t.hp);  // 25 : 25
		heal(t);  // Thiefインスタンスの参照が渡されている
		System.out.println(baseHp + " : " + t.hp);  // 25 : 35
	}

}
