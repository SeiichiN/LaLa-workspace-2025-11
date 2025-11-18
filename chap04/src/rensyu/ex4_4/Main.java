package rensyu.ex4_4;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = new java.util.Random().nextInt(10);
		
		do {
			numbers[1] = new java.util.Random().nextInt(10);
		} while(numbers[0] == numbers[1]);
		
		do {
			numbers[2] = new java.util.Random().nextInt(10);
		} while(numbers[0] == numbers[2] || 
				numbers[1] == numbers[2]);

		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int number : numbers) {
			if (number == input) {
				System.out.println("あたり");
			}
		}
		
		System.out.println("終わり");
	}

}
