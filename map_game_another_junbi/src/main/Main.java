package main;

public class Main {

	public static void main(String[] args) {
		GameManager gm = new GameManager(6, 6);

		gm.setMonster('g');
		gm.setMonster('s');
		gm.setItem('p');

		Player player = new Player("太郎", gm);
		gm.printMap(player);
		while (true) {
			player.command();
			if (gm.isEndCheck()) {
				gm.gameOver(player);
			}
			gm.moveChar.move();
			gm.printMap(player);
			player.look();
		}
	}

}
