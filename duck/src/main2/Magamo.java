package main2;

public class Magamo extends Bird {

	public Magamo() {
		super("マガモ");
	}

	@Override
	public void say() {
		System.out.println(this.name + "は、ガアガアと鳴く");
	}

}
