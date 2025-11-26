package main;

public class Main {

	public static void main(String[] args) {
		Hero h	= new Hero("勇者", 100);
		h.move();
		h.setMovable(new BusMove());
		h.move();
		h.setMovable(new TrainMove());
		h.move();
		h.setMovable(new AirplainMove());
		h.move();
	}

}
