package main;

public class NormalSwim implements Swimming {
	public Bird bird;
	
	public NormalSwim(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void swim() {
		System.out.println(this.bird.name + "は、スイスイ泳ぐ。");
		
	}	

}
