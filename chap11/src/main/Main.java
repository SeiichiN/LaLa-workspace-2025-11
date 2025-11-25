package main;

public class Main {

	public static void main(String[] args) {
		Dancer dancer = new Dancer("ミユキ");
		Matango m = new Matango('A');
		dancer.attack(m);
		dancer.dance();
		dancer.run();
	}

}
