package main;

public class RabberDuck extends Toy {

	public RabberDuck(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "はプカプカと浮く");
	}

	public void say() {
		System.out.println(this.name + "はキュキュッと鳴く");
	}
}
