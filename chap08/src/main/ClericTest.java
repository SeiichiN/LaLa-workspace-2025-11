package main;

public class ClericTest {

	public static void main(String[] args) {
		
		Cleric cleric = new Cleric();
		cleric.name = "マロン";
		cleric.selfAid();
		cleric.pray(4);
	}

}
