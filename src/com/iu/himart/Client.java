package com.iu.himart;

public class Client extends Himart {
	
	private int money;
	private int point;
	

	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
		
	}
	
	public void buy(Himart himart){
		this.money -= himart.getPrice();
		this.point += himart.getPoint();
		}
//	public void buy(Himart himart) {
//		this.money -= himart.getPrice();
//		this.point += himart.getPoint();
//		
//	}
//	public void buy(Himart himart) {
//		this.money -= himart.getPrice();
//		this.point += himart.getPoint();
//		
//	}
	
	

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
