package main;

import java.util.Random;

public class Com {
	private String name;
	private int number;
	
	public Com() {
		this.name = "コム";
		this.setTheNumber();
	}
	public void setTheNumber() {
		this.number = new Random().nextInt(100);
	}
	public boolean quessTheNumber(int number) {
		if (number > this.number) {
			System.out.println("もっと小さい");
		} else if (number < this.number) {
			System.out.println("もっと大きい");
		} else {
			System.out.println("正解");
			return true;
		}
		return false;
	}
}
