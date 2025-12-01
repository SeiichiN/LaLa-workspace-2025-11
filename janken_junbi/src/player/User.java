package player;

import java.util.Scanner;

public class User extends Player {
	Scanner sc = new Scanner(System.in);

	public User() {
		super.name = "ユーザー";
	}
	
	@Override
	public void selectHand() {
		System.out.print
		  ("選択 0:グー 1:チョキ 2:パー >");
		super.hand = sc.nextInt(3);
	}

}
