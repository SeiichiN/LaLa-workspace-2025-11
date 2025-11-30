package main;

import java.util.Random;

public class MoveCharImpl implements MoveChar {
	GameManager gm;
	
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

    /*
	private boolean isMovable(int y, int x) {
		if (y < 0 || y >= gm.YSIZE || x < 0 || x >= gm.XSIZE) return false;
		return true;
	}
	
	private boolean[] makeMovableCells(int y, int x) {
		boolean[] cells = new boolean[5];
		cells[0] = isMovable(y, x);
		cells[1] = isMovable(y - 1, x);
		cells[2] = isMovable(y + 1, x);
		cells[3] = isMovable(y, x - 1);
		cells[4] = isMovable(y, x + 1);
		return cells;		
	}
	
	private int[] getYX(int i) {
		int[] ret = switch (i) {
		case 0 -> new int[] {0, 0};
		case 1 -> new int[] {-1, 0};
		case 2 -> new int[] {1, 0};
		case 3 -> new int[] {0, -1};
		case 4 -> new int[] {0, 1};
		default -> new int[] {0, 0};
		};
		return ret;
	}
	
	private void moveChara(int y, int x) {
		Random r = new Random();	
		boolean[] cells = makeMovableCells(y, x);
		int idx = r.nextInt(5);
		while (!cells[idx]) {
			idx = r.nextInt(5);
		}
		int [] yx = getYX(idx);
		int newY = yx[0];
		int newX = yx[1];
		
		if (gm.map[newY][newX] != '.') return;
		gm.map[newY][newX] = gm.map[y][x];
		gm.map[y][x] = '.';
	}
	*/
}
