package main;

import java.util.Scanner;

public class User {
	String name;
	private Scanner sc = new Scanner(System.in);
	private Com com = new Com();
	
	public User() {
		this.name = "ユーザー";
	}
	public void inputNumber() {
		int number = 0;
		while (true) {
			System.out.println("1〜99の数字を入力してください");
			number = getSafeInt();
			if (number >= 1 && number <= 99) {
				if (com.checkTheNumber(number)) {
					break;
				}			
			} else {
				System.out.println("1〜99の数字を入力してください");
			}
		}
	}
	private int getSafeInt() {
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			System.out.println("数字を入力してください");
			sc.nextInt();
			return getSafeInt();
		}
	}
}
