package com.iu.unit;

public abstract class AirUnit extends Unit {
	
	public AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	private int wings;
	
//	public AirUnit () {
//		super(20);
//	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

}
