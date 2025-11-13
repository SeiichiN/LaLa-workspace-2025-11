package codeium;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("char型の数字を入力してください: ");
        char ch = scanner.nextLine().charAt(0);

        int extractedNum = extractIntFromChar(ch);
        System.out.println("int型の値は" + extractedNum + "です。");

        scanner.close();
    }

    public static int extractIntFromChar(char ch) {
        return ch - '0';
    }
}