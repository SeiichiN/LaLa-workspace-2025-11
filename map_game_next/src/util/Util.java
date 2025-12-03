package util;

import java.util.Scanner;

public class Util {
	public final Scanner SC = new Scanner(System.in);
	
	public char getChar(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = SC.nextLine();
			if (input.length() == 1) {
				return input.charAt(0);
			}
		}
	}
}
