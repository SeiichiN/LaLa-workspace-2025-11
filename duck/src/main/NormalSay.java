package main;

public class NormalSay implements Saying {
	public Bird bird;
	
	public NormalSay(Bird bird) {
		this.bird = bird;
	}
	
	public void say() {
		System.out.println(this.bird.name + "は、ガアガアと鳴く");
	}

}
