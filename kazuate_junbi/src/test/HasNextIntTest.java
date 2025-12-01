package test;

import java.util.Scanner;

public class HasNextIntTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		while (!sc.hasNextInt()) {
			System.out.println("数字を入力してください");
			sc.next();
		}
		System.out.println(sc.nextInt());

	}

}
