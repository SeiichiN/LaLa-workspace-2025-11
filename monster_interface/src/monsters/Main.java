package monsters;

public class Main {

	public static void main(String[] args) {
		Dancer d = new Dancer("ミユキ");
		
		Runnable walkingRun = new WalkingRun();
		Goblin g = new Goblin("ゴブリン");
		g.setRunnable(walkingRun);
		g.run();
		Werewolf w = new Werewolf("ワーウルフ");
		w.setRunnable(walkingRun);
		w.run();
		Runnable flyingRun = new FlyingRun();
		DeathBat de = new DeathBat("デスバット");
		de.setRunnable(flyingRun);
		de.run();
	}

}
