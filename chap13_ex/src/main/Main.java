package main;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(30);
		Wand wand = new Wand();
		wand.setPower(10.0);
		wand.setName("魔法の杖");
		Wizard w = new Wizard(wand);
		w.setName("アサカ");
		w.setMp(-20);
		
		w.heal(h);

	}

}
