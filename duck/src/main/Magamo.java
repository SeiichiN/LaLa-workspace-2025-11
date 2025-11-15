package main;

public class Magamo extends Bird implements Flying, Swimming {
	Flying FlyBehavior;
	Swimming SwimBehavior;
	Saying SayBehavior;
	
	public Magamo(String name) {
		super(name);
		this.FlyBehavior = new NormalFly();
		this.SwimBehavior = new NormalSwim();
		this.SayBehavior = new NormalSay();
	}

	@Override
	public void say() {
		System.out.print(this.name + "は");
		this.SayBehavior.say();
	}

	@Override
	public void swim() {
		System.out.print(this.name + "は");
		this.SwimBehavior.swim();
		
	}

	@Override
	public void fly() {
		System.out.print(this.name + "は");
		this.FlyBehavior.fly();
		
	}
	
	public void setFlyBehavior(Flying FlyBehavior) {
		this.FlyBehavior = FlyBehavior;
	}
	
	public void setSwimBehavior(Swimming SwimBehavior) {
		this.SwimBehavior = SwimBehavior;
	}
}
