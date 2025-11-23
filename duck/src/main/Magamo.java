package main;

public class Magamo extends Bird implements Flying, Swimming {
	Flying FlyBehavior;
	Swimming SwimBehavior;
	Saying SayBehavior;
	
	public Magamo(String name) {
		super(name);
		this.FlyBehavior = new NormalFly(this);
		this.SwimBehavior = new NormalSwim(this);
		this.SayBehavior = new NormalSay(this);
	}

	@Override
	public void say() {
		this.SayBehavior.say();
	}

	@Override
	public void swim() {
		this.SwimBehavior.swim();
		
	}

	@Override
	public void fly() {
		this.FlyBehavior.fly();
		
	}
	
	public void setFlyBehavior(Flying FlyBehavior) {
		this.FlyBehavior = FlyBehavior;
	}
	
	public void setSwimBehavior(Swimming SwimBehavior) {
		this.SwimBehavior = SwimBehavior;
	}
}
