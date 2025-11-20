package main;

public abstract class Monster {
	public String type;
	public int hp = 100;
	public char suffix;
	
	public Monster(char suffix, String type) {
		this.type = type;
		this.suffix = suffix;
	}
	
	public void attack(Player player) {
		if (this.hp <= 0) return;
		int damage = new java.util.Random().nextInt(30);
		player.hp -= damage;
		System.out.println(player.name + "は" + damage + "のダメージを受けた!");
	}
}
