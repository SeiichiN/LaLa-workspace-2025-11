package main;

public class Thief2 {
	String name;
	int hp = 100;
	int mp;
	static int age;
	
	static {
		System.out.println("static!!");
		age = 23;
	}
	{
		this.mp = 50;
		System.out.println("mp=50");
	}
	
	public Thief2() {
		this.name = "シーフ";
		System.out.println("コンストラクタ");
	}
	
}
