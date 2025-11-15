package main;

public abstract class Bird implements Saying {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	@Override
	public abstract void say();
	
}
