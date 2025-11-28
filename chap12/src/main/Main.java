package main;

public class Main {

	public static void main(String[] args) {
		Character c = new Wizard();
		Matango m = new Matango('A');
		if (c instanceof Wizard w) {
			w.name = "アサカ";
			w.attack(m);
			w.fireball(m);
		} else {
			System.out.println("cはWizardインスタンスではない");
		}
	}

}
