package rensyu.ex5_2;

public class Main {

	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名: " + title);
		System.out.println("本文: " + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名: 無題");
		System.out.println("本文: " + text);
	}
	
	public static void main(String[] args) {
		String text = """
				こんにちは。
				お元気ですか。こちらは相変わらずです。
				また、遊びにいきます。
				""";
		email("連絡", "abc@gmail.com", text);

		String text2 = """
				こんにちは。
				お元気ですか？
				さようなら。
				""";
		email("abc@gmail.com", text2);
		
	}

}
