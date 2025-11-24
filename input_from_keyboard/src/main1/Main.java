package main1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String msg = getStr("Enter a message: ");
		System.out.println(msg);

	}

	public static String getStr(String prompt) {
		System.out.print(prompt);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			return reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
