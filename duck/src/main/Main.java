package main;

public class Main {

	public static void main(String[] args) {
		Magamo magamo = new Magamo("マガモ");
		magamo.say();
		magamo.swim();
		magamo.fly();
		
		magamo.setFlyBehavior(new JetFly());
		magamo.fly();
		
		Duck duck = new Duck("アヒル");
		duck.say();
		duck.swim();
		
		RabberDuck rduck = new RabberDuck("ラバーダック");
		rduck.say();
		rduck.swim();
	}

}
