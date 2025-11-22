package main;

public class Main {

	public static void main(String[] args) {
		GameManager gm = new GameManager();

		Goblin g = new Goblin();
		gm.setMonster(g);
		Slime s = new Slime();
		gm.setMonster(s);
		
		Potion p = new Potion();
		gm.setItem(p);

		Player player = new Player("太郎", gm);
		gm.printMap(player);
		while (true) {
			player.command();
			gm.printMap(player);
			player.look();
		}
	}

}
