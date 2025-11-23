package main;

import java.util.Random;

public class MoveCharImpl implements MoveChar {
	GameManager gm;
	
	public MoveCharImpl(GameManager gm) {
		this.gm = gm;
	}
	
	@Override
	public void move() {
		for (int y = 0; y < gm.YSIZE; y++) {
			for (int x = 0; x < gm.XSIZE; x++) {
				if (gm.map[y][x] != '.') {
					moveCharacter(y, x);
				}
			}
		}
	}
	
	private void moveCharacter(int y, int x) {
		if (gm.map[y][x] == 'p') return;
		Random r = new Random();
		int dy = r.nextInt(3) - 1;
		int dx = r.nextInt(3) - 1;
		if (dy == 0 && dx == 0) return;
		int ny = y + dy;
		int nx = x + dx;
		if (ny < 0 || ny >= gm.YSIZE || nx < 0 || nx >= gm.XSIZE) return;
		if (y != ny && x != nx) return;
		if (gm.map[ny][nx] != '.') return;
		gm.map[ny][nx] = gm.map[y][x];
		gm.map[y][x] = '.';
	}

}
