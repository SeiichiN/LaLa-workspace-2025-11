package main;

public class Wand {
	private String name;
	private double power;
	
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException
			  ("増幅率の設定数値が範囲外です。");
		}
		this.power = power;
	}
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException
			  ("杖の名前が短すぎる。");
		}
		this.name = name;
	}
}
