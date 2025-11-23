package main;

public class NormalFly implements Flying {
	public Bird bird;

	public NormalFly(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void fly() {
		System.out.println(this.bird.name + "は、バサバサと飛ぶ。");
		
	}

}
