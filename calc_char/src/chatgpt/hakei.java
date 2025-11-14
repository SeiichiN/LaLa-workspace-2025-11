package chatgpt;

public class hakei {

	public static void main(String[] args) {
        for (char c = 0; c < 100; c++) {
            int width = (c % 20);
            System.out.println(" ".repeat(width) + c);
        }
	}

}
