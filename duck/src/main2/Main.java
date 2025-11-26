package main2;

public class Main {

	public static void main(String[] args) {
		Flyable flyable = new FlyBehavior();
		Flyable notFlyable = new NotFlyBehavior();
		Swimmable swimmable = new SwimBehavior();
		Ahiru ahiru = new Ahiru();
		ahiru.setFlyBehavior(notFlyable);
		ahiru.setSwimBehavior(swimmable);
		ahiru.say();
		ahiru.swim();
		ahiru.fly();
		
		Magamo magamo = new Magamo();
		magamo.setFlyBehavior(flyable);	
		magamo.setSwimBehavior(swimmable);
		magamo.say();
		magamo.swim();
		magamo.fly();
	}

}
