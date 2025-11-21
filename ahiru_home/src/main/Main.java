package main;

public class Main {

	public static void main(String[] args) {
		Magamo magamo = new Magamo("マガモ");
		magamo.swim();
		magamo.fly();
		magamo.say();
		
		Ahiru ahiru = new Ahiru("アヒル");
		ahiru.swim();
		ahiru.say();
		
		RabberDuck rd = new RabberDuck("ラバーダック");
		rd.say();
		rd.swim();
	}

}
