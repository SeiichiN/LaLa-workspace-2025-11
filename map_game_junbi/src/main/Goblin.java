package main;

public class Goblin extends Monster {
	
	public Goblin(char suffix, String type) {
		super(suffix, type);
	}

	public Goblin() {
		this('g', "ゴブリン");
	}
	
	@Override
	public void attack(Player player) {
		System.out.println("\n" + type + "は" + player.name + "を攻撃した!");
		super.attack(player);
	}
}
