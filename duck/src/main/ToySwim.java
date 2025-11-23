package main;

public class ToySwim implements Swimming {
	public Toy toy;
	
	public ToySwim(Toy toy) {
		this.toy = toy;
	}

	@Override
	public void swim() {
		System.out.println(toy.name + "は、ふわふわと浮く。");
		
	}

}
