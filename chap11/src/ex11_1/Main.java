package ex11_1;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("いやいやえん", 1500, "白", "1234" );
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getColor());
		System.out.println(book.getIsbn());
		
		Computer com = new Computer("pc", 100000, "白", "HP");
		System.out.println(com.getName());
		System.out.println(com.getPrice());
		System.out.println(com.getColor());
		System.out.println(com.getMakerName());
		

	}

}
