package main1;

public class Magamo extends SwimFlyBird {

	public Magamo(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガアと鳴く");
	}

}
