package monsters;

public abstract class Character {
	String name;
	int hp;
	
	public Character(String name) {
		this(name, 100);
	}
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public abstract void attack(Matango m);

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
}
