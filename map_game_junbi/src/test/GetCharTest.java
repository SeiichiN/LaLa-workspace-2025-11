package test;

import java.io.IOException;

public class GetCharTest {

	public static void main(String[] args) throws IOException {
		System.out.println("キーを押してください");
		int key = System.in.read();
		System.out.println(key);

	}

}
