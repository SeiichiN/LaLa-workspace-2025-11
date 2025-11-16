package main;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] brr = arr;
		brr[0] = 10;
		System.out.println(arr[0]);

	}

}
