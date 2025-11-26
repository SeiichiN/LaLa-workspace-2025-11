package main;

public abstract class SwimmingBird extends Bird {

	public SwimmingBird(String name) {
		super(name);
	}

	public abstract void say();
	
	public void swim() {
		System.out.println(this.name + "は、スイスイと泳ぐ。");
	}

}
