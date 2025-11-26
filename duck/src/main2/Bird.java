package main2;

public abstract class Bird {
	String name;
	Flyable flyable;
	Swimmable swimmable;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public abstract void say();
	
	public void fly() {
		this.flyable.fly();
	}
	
	public void swim() {
		this.swimmable.swim();
	}
	
	public void setFlyBehavior(Flyable flyable) {
		this.flyable = flyable;
	}
	
	public void setSwimBehavior(Swimmable swimmable) {
		this.swimmable = swimmable;
	}
}
