package main;

public class ToySay implements Saying {
	public Toy toy;
	
	public ToySay(Toy toy) {
		this.toy = toy;
	}

	@Override
	public void say() {
		System.out.println(toy.name + "は、キュキュと鳴く");		
	}

}
