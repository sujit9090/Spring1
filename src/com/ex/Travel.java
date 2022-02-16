package com.ex;

public class Travel implements journey {
	Vehicle v;
	public void setV(Vehicle v) {
		this.v = v;
	}
	public void startJourney() {
		System.out.println("Starting Journey");
		v.move();
	}

}
