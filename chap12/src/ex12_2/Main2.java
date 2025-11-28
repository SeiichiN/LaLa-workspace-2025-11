package ex12_2;

public class Main2 {

	public static void main(String[] args) {
		Y[] ys = new Y[2];
		ys[0] = new A();
		ys[1] = new B();
		for (Y y : ys) {
			y.b();       // AbBb
		}
		for (int i = 0; i < ys.length; i++) {
			ys[i].b();
		}
	}

}
