package main;

public abstract class FlyingSwimmingBird extends Bird {

	public FlyingSwimmingBird(String name) {
		super(name);
	}

	public abstract void say();
	
	public void fly() {
		System.out.println(this.name + "は、バサバサと飛ぶ。");
	}
	
	public void swim() {
		System.out.println(this.name + "は、スイスイと泳ぐ。");
	}

}
