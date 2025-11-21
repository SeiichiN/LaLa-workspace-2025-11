package main;

public class Bird {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイと泳ぐ");
	}
	public void say() {
		System.out.println(this.name + "はガアガアと鳴く");
	}
}
