package main;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Sword s1 = new Sword();
		s1.name = "炎の剣";
		s1.damage = 10;
		h1.sword = s1;
		
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
				
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + " : " + h1.hp);
		System.out.println(h2.name + " : " + h2.hp);
		
	}

}
