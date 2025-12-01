package main;

import characters.Hero;
import monsters.Goblin;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ア");

		Goblin g = new Goblin();
		h.attack(g);
		
		g.attack(h);
	}

}
