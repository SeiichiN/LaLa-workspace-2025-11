package main;

public abstract class FlyingBird extends Bird {

	public FlyingBird(String name) {
		super(name);
	}

	public abstract void say();
	
	public void fly() {
		System.out.println(this.name + "は、バサバサと飛ぶ。");
	}

}
