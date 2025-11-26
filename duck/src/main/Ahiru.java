package main;

public class Ahiru extends SwimmingBird {
	public Ahiru() {
		super("アヒル");
	}

	@Override
	public void say() {
		System.out.println(this.name + "は、ガアガアと鳴く");			
	}

}
