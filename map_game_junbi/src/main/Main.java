package main;

public class Main {

	public static void main(String[] args) {
		GameManager gm = new GameManager();
		gm.setPosition('g');
		gm.setPosition('s');
		gm.setPosition('p');
		Player player = new Player(gm);
		gm.printMap(player);
		while (true) {
			player.command();
			gm.printMap(player);
		}
	}

}
