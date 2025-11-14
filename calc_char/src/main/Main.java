package main;

public class Main {

	public static void main(String[] args) {
		char sum = 'a' + 1;
		System.out.println(sum);
		int b = '3' - '0';
		System.out.println(b);
		System.out.println("Input Number");
		char num = new java.util.Scanner(System.in).nextLine().charAt(0);
		int val = num;
		System.out.println(val);
		System.out.println("---------------");
		char c = 69;
		System.out.println(c);
		System.out.println("---------------");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}

}
