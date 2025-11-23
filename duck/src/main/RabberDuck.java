package main;

public class RabberDuck extends Toy implements Swimming {
	Swimming SwimBehabior;
	Saying SayBehabior;

	public RabberDuck(String name) {
		super(name);
		this.SwimBehabior = new ToySwim(this);
		this.SayBehabior = new ToySay(this);
	}

	@Override
	public void swim() {
		this.SwimBehabior.swim();
		
	}

	public void say() {
		this.SayBehabior.say();
		
	}

}
