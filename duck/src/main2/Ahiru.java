package main2;

public class Ahiru extends Bird {
	public Ahiru() {
		super("アヒル");
	}

	@Override
	public void say() {
		System.out.println(this.name + "は、ガアガアと鳴く");			
	}

}
