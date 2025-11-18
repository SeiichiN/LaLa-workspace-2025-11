package main.code5_7;

/**
 *	main.code5_7パッケージ
 *	Main2クラス
 *	
 *	printTotal() というメソッド。
 *	引数にint型をとる。
 *	1～引数までを合計する。
 *	合計を表示する。
 */
public class Main2 {

	public static void main(String[] args) {
		printTotal(10);
	}
	
	public static void printTotal(int num) {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			if (i == 3)  {
				System.out.println("やめ");
				return;
			}
			total += i;
		}
		System.out.println
		  ("1～" + num + "までの合計は " + total);
	}

}
