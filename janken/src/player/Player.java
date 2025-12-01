package player;

public abstract class Player {
	String name;
	int hand;
	String[] jhands = {"グー", "チョキ", "パー"};
	
	public abstract void selectHand();
	
	public void printHand() {
		System.out.println
		  (this.name + "は" + jhands[hand]);
	}
}
