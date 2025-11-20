package main;

public class Slime extends Monster {
	
	public Slime(char suffix, String type) {
		super(suffix, type);
	}

	public Slime() {
		this('s', "スライム");
	}
	
	@Override
	public void attack(Player player) {
		System.out.println("\n" + type + "は" + player.name + "を攻撃した!");
		super.attack(player);
	}
}
