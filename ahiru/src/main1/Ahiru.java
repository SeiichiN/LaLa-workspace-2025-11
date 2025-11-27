package main1;

public class Ahiru extends SwimBird {

	public Ahiru(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガア鳴く");
	}

}
