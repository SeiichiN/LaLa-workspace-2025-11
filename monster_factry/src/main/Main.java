package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("モンスターを生成します。(g:ゴブリン, s:スライム) > ");
		char c = sc.nextLine().charAt(0);
		
		Monster m = MonsterFactory.createMonster(c);
		if (m == null) {
			System.out.println("不明なモンスター");
			return;
		}
		
		System.out.println("モンスターが現れた！");
		m.attack();
		m.specialMove();
	}

}
