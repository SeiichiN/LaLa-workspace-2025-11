package ex12_2;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();   // Aa
		// obj.b();
		// obj.c();
		
		System.out.println();

		Y y1 = new A();  
		Y y2 = new B();
		y1.a();  // Aa
		y2.a();  // Ba
	}

}
