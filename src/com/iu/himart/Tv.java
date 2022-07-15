package com.iu.himart;

public class Tv extends Himart {
	
	private int size;
	
	
	public Tv() {
		this.size = 50;
		this.setBrand("삼성");
		this.setPrice(2000000);
		this.setPoint(100);
		
	}
	
	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}

	public void info() {
		super.info();
		System.out.println(this.getSize());
	}


	
	

}
