package player;

import java.util.Random;

public class Com extends Player{
	public Com() {
		super.name = "コム";
	}

	@Override
	public void selectHand() {
		super.hand = new Random().nextInt(3);
	}

}
