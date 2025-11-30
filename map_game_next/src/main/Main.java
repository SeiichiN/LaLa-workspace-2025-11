package main;

public class Main {
	public static void main(String[] args) {
		GameManager gm = new GameManager(5, 5);
		gm.setPosition('g');
		gm.setPosition('s');
		gm.setPosition('p');
		
		gm.printMap();
		
	}
}
