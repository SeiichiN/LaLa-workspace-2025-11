package chatgpt;

public class ango {

	public static void main(String[] args) {
        String text = "HELLO WORLD";
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            // A〜Z の場合だけ1文字ずらす
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char)(c + 1);
                if (shifted > 'Z') shifted = 'A';  // Z の次は A
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
	}

}
