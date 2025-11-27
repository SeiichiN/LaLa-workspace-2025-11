package main2;

public class Ahiru extends Bird implements Swimmable {

	public Ahiru(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガア鳴く");
	}

}
