package main;

public class Magamo extends Bird implements Flying, Swimming {
	Flying FlyBehavior;
	
	public Magamo(String name) {
		super(name);
		this.FlyBehavior = new NormalFly();
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガアと鳴く。");
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ。");
		
	}

	@Override
	public void fly() {
		System.out.print(this.name + "は");
		this.FlyBehavior.fly();
		
	}
	
	public void setFlyBehavior(Flying FlyBehavior) {
		this.FlyBehavior = FlyBehavior;
	}
	
}
