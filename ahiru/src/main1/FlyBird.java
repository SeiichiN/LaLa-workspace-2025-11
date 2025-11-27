package main1;

public abstract class FlyBird extends Bird {

	public FlyBird(String name) {
		super(name);
	}
	
	public void fly() {
		System.out.println(this.name + "はバサバサ飛ぶ");
	}
}
