package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤
		Iu iu = Iu.getInstance();
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
		int age = iu.getAge();
		
		System.out.println(name);
		System.out.println(age);
		
		
		
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		
		//Iu iu2 = new Iu();

	}

}
