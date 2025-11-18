package main.code4_14;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20,30,40,50,80};
		int sum = 0;
		for (int value : scores) {
			System.out.println(value);
			sum += value;
		}
		System.out.println("合計:" + sum);
	}

}
