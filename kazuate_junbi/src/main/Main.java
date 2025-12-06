package main;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		User user = new User();
		while (true) {
			int number = user.inputNumber();
			if (com.checkTheNumber(number)) break;
		}
		System.out.println("ゲーム終了");
	}

}
