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
		while (true) {
			System.out.println("1〜99の数字を入力してください");
			int number = sc.nextInt();
			if (com.quessTheNumber(number)) {
				break;
			}			
		}
	}
}
