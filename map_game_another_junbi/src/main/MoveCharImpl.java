package main;

import java.util.Random;

public class MoveCharImpl implements MoveChar {
	GameManager gm;
	private int[][] dir = {{0, 0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	private Random rnd = new Random();	

	
	public MoveCharImpl(GameManager gm) {
		this.gm = gm;
	}
	
	private boolean isHereMonster(int y, int x) {
		if (gm.map[y][x] == 'g' || gm.map[y][x] == 's') return true;
		return false;
	}
	
	@Override
	public void move() {
		for (int y = 0; y < gm.YSIZE; y++) {
			for (int x = 0; x < gm.XSIZE; x++) {
				if (isHereMonster(y, x)) {
					moveCharacter(y, x);
				}
			}
		}
	}
	
	/*
	private void moveCharacter(int y, int x) {
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
	*/
    
	private boolean isMovable(int y, int x) {
		if (y < 0 || y >= gm.YSIZE || x < 0 || x >= gm.XSIZE) return false;
		if (gm.map[y][x] != '.') return false;
		return true;
	}
	
	private void moveCharacter(int y, int x) {
		int nextY, nextX;
		do {
			int idx = rnd.nextInt(5);
			nextY = y + dir[idx][0];
			nextX = x + dir[idx][1];
		} while (!isMovable(nextY, nextX));
		gm.map[nextY][nextX] = gm.map[y][x];
		gm.map[y][x] = '.';
	}
	
}
