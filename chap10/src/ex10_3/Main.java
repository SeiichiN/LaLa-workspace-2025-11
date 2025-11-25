package ex10_3;

public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('A');
		Hero h = new Hero();
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		
	}

}
