package main2;

public class NotFlyBehavior implements Flyable {

	@Override
	public void fly() {
		System.out.println("飛びない");
	}

}
