package main;

public class Player {
	public int py;
	public int px;
	private GameManager gm;
	public Player(GameManager gm) {
		this.gm = gm;
		setRandomPos();
	}
	private void setRandomPos() {
		py = new java.util.Random().nextInt(gm.YSIZE);
		px = new java.util.Random().nextInt(gm.XSIZE);
	}
	
	public void command() {
		System.out.print("wsad > ");
		@SuppressWarnings("resource")
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		switch (ch) {
			case 'w' -> {
				py = Math.max(0, py - 1);
			}
			case 's' -> {
				py = Math.min(gm.YSIZE - 1, py + 1);
			}
			case 'a' -> {
				px = Math.max(0, px - 1);
			}
			case 'd' -> {
				px = Math.min(gm.XSIZE - 1, px + 1);
			}
		}
	}
}
