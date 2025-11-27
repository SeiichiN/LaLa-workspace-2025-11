package main1;

public abstract class SwimFlyBird extends Bird {

	public SwimFlyBird(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
	
	public void fly() {
		System.out.println(this.name + "はバサバサ飛ぶ");
	}

}
