package main;

public class Slime extends Monster {
	
	public Slime(char suffix, String name, int hp) {
		super(suffix, name, hp);
	}

	public Slime() {
		this('s', "スライム", 100);
	}
	
	public Slime(int hp) {
		this('s', "スライム", hp);
	}
	
}
