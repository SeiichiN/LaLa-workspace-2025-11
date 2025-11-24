package main;

import util.ReadSettings;

public class Main {

	public static void main(String[] args) {
		ReadSettings rs = new ReadSettings();
		GameManager gm = new GameManager(rs.YSIZE, rs.XSIZE);

		for (int i = 0; i < rs.NUM_GOBLIN; i++) {
			gm.setMonster('g');
		}
		for (int i = 0; i < rs.NUM_SLIME; i++) {
			gm.setMonster('s');
		}
		for (int i = 0; i < rs.NUM_POTION; i++) {
			gm.setItem('p');
		}

		Player player = new Player(rs.NAME, gm);
		gm.printMap(player);
		while (true) {
			player.command();
			if (gm.isCheckDefeated() || gm.isEnd) {
				break;
			}
			gm.moveChar.move();
			gm.printMap(player);
			player.look();
		}
		gm.gameOver(player);
	}

}
