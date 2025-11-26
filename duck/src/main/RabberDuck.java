package main;

public class RabberDuck extends Toy {

	public RabberDuck() {
		super("ラバーダック");
	}

	public void swim() {
		System.out.println(this.name + "は、プカプカと浮かぶ。");
		
	}

	public void say() {
		System.out.println(this.name + "は、キュキュと鳴く");
		
	}

}
