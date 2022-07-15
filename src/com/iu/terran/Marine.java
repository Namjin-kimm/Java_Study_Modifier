package com.iu.terran;

import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Marine extends Unit implements Attacker{
	
	
	
	private String weapon;
	
	public Marine() {
		super(30);
		//super(); //생략되었다.
		System.out.println("Marine 생성자");
	}
	
	
	
	public String getWeapon() {
		return weapon;
	}
	
	//오버라이딩
	public void move() {
		super.info(); //부모의 info도 볼 수 있다.
		System.out.println("뛰어다님");
	}
	
	//이렇게 한다는 것 자체가 오버라이딩 한것, 선언하는것 자체
	public void info() {
		System.out.println("Marine Info");
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		this.shoot();
	}
	
	
	public void shoot() {
		System.out.println("우다다다");
	}
	
	

}
