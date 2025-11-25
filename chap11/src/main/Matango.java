package main;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
		this.hp = 50;
	}
	
	public void run() {
		System.out.println
		  ("お化けきのこ" + this.suffix + "は逃げ出した");
	}
}
