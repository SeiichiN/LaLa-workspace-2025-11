package main.code4_5;

public class Main {
	public static void main(String[] args) {
		int[] scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);
		
		String[] animals = new String[3];
		animals[1] = "dog";
		System.out.println(animals[0]);
		
		
		// 配列の作成と同時に初期値を入れる
		int[] scores1 = new int[] {20, 30, 40, 50, 80};
		
		int[] scores2 = {20, 30, 40, 50, 80};
		
		String[][] map = {
				{".", ".", ".", ".", "."},
				{".", ".", "g", ".", "."},
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."}
		};
		System.out.println(map[1][2]);
	}
}
