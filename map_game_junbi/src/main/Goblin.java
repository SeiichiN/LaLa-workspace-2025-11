package main;

public class Goblin extends Monster {
	
	public Goblin(char suffix, String type) {
		super(suffix, type);
	}

	public Goblin() {
		this('g', "ゴブリン");
	}
	
}
