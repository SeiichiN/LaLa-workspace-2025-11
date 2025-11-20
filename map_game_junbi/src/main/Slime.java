package main;

public class Slime extends Monster {
	
	public Slime(char suffix, String type) {
		super(suffix, type);
	}

	public Slime() {
		this('s', "スライム");
	}
	
}
