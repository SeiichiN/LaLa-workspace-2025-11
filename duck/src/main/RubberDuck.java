package main;

public class RubberDuck extends Bird implements Swimming {
	Swimming SwimBehabior;
	Saying SayBehabior;

	public RubberDuck(String name) {
		super(name);
		this.SwimBehabior = new ToySwim();
		this.SayBehabior = new ToySay();
	}

	@Override
	public void swim() {
		System.out.print(this.name + "は");
		this.SwimBehabior.swim();
		
	}

	@Override
	public void say() {
		System.out.print(this.name + "は");
		this.SayBehabior.say();
		
	}

}
