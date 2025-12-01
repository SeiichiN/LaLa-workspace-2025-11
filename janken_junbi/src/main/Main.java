package main;

import player.Com;
import player.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.selectHand();
		Com com = new Com();
		com.selectHand();
		user.printHand();
		com.printHand();
	}

}
