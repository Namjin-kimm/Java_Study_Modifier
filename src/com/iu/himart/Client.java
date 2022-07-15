package com.iu.himart;

public class Client extends Himart {
	
	private int money;
	private int point;
	

	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
		
	}
	
	public void buy(Computer computer) {
		this.money -= computer.getPrice();
		this.point += computer.getPoint();
		
	}
	public void buy(Phone phone) {
		this.money -= phone.getPrice();
		this.point += phone.getPoint();
		
	}
	public void buy(Tv tv) {
		this.money -= tv.getPrice();
		this.point += tv.getPoint();
		
	}
	
	

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
}
