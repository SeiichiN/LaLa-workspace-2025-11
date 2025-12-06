package main;

import java.util.Scanner;

public class User {
	String name;
	private Scanner sc = new Scanner(System.in);
	
	public User() {
		this.name = "ユーザー";
	}
	public int inputNumber() {
		int number = 0;
		while (true) {
			System.out.println("1〜99の数字を入力してください");
			number = getSafeInt();
			if (number >= 1 && number <= 99) {
				return number;
			} else {
				System.out.println("1〜99の数字を入力してください");
			}
		}
	}
	private int getSafeInt() {
		// スキャナの次のトークンが有効なint値である場合、trueを返す
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			System.out.println("数字を入力してください");
			sc.next();
			return getSafeInt();
		}
	}
}
