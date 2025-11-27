package use_interface;

public class Main {

	public static void main(String[] args) {
		Runnable walkRun = new WalkRun();
		Runnable flyRun = new FlyRun();
		
		Goblin g = new Goblin("ゴブリン");
		g.setRunnable(flyRun);
		g.run();
		
		DeathBat d = new DeathBat("地獄コウモリ");
		d.setRunnable(walkRun);
		d.run();

	}

}
