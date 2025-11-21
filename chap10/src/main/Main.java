package main;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		SuperHero sh = new SuperHero();
		sh.attack(m);
		sh.fly();
		sh.attack(m);
	}

}
