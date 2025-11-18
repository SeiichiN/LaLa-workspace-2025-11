package main.code5_7;

/**
 *	main.code5_7パッケージ
 *	Main3クラス
 *	
 *	printTotal() というメソッド。
 *	引数にint型をとる。
 *	1～引数までを合計する。
 *	合計を戻り値とする。
 */
public class Main3 {

	public static void main(String[] args) {
		int num = 10;
		int total = getTotal(num);
		System.out.println
		  ("1～" + num + "までの合計は " + total);
		
	}
	
	public static int getTotal(int num) {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			if (i == 3) {
				System.out.println("やめ");
				return 0;
			}
			total += i;
		}
		return total;
	}

}
