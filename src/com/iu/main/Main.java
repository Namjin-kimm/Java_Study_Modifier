package com.iu.main;

import com.iu.terran.Marine;
import com.iu.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		
//		m1.setHp(0);
//		m1.setHp(30);
//		m1.info();
//		m1.move();
		
		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		//System.out.println(unit.getW);//웨폰에는 접근을 못 한다. 와이?
		//원래 마린에는 웨폰이 있지만 지금 이 m1은 unit type이 되버린 것이다. 그렇기에 unit의 멤버에만
		//접근할 수 있다. 그러므로 웨폰에 접근하지 못함.
		
		m1 = (Marine)unit;
		System.out.println(m1.getWeapon());
		
		
	}

}
