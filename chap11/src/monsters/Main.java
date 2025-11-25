package monsters;

public class Main {

	public static void main(String[] args) {
		Dancer d = new Dancer("ミユキ");
		
		Goblin g = new Goblin("ゴブリン");
		g.attack(d);
		Werewolf w = new Werewolf("ワーウルフ");
		w.attack(d);
		DeathBat de = new DeathBat("デスバット");
		de.attack(d);
	}

}
