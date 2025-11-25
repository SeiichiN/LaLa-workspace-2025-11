package monsters;

public class Main {

	public static void main(String[] args) {
		Dancer d = new Dancer("ミユキ");
		
		Runnable walkingRun = new WalkingRun();
		Goblin g = new Goblin("ゴブリン", walkingRun);
		g.run();
		Werewolf w = new Werewolf("ワーウルフ", walkingRun);
		w.run();
		Runnable flyingRun = new FlyingRun();
		DeathBat de = new DeathBat("デスバット", flyingRun);
		de.run();
	}

}
