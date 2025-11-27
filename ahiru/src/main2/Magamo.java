package main2;

public class Magamo extends Bird 
                      implements Flyable, Swimmable {

	public Magamo(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}

	@Override
	public void fly() {
		System.out.println(this.name + "はバサバサ飛ぶ");
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガア鳴く");
	}

}
