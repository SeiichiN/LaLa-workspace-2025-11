package main;

class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Goblin g = new Goblin();
		h.attack(g);
	}
}

class Hero {
	String name = "ミナト";
	void attack(Goblin g) {
		System.out.println(g.name + "を攻撃");
	}
}

class Goblin {
	String name = "ゴブリン";
	void attack(Hero h) {
		System.out.println(h.name + "を攻撃");
	}
}
