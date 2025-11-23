package main;

public class Duck extends Bird implements Swimming {
	Swimming SwimBehavior;
	Saying SayBehavior;

	public Duck(String name) {
		super(name);
		this.SwimBehavior = new NormalSwim(this);
		this.SayBehavior = new NormalSay(this);
	}

	@Override
	public void swim() {
		System.out.print(this.name + "は");
		this.SwimBehavior.swim();
	}

	@Override
	public void say() {
		System.out.print(this.name + "は");
		this.SayBehavior.say();
		
	}

}
