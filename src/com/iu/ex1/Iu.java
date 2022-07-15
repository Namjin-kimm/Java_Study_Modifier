package com.iu.ex1;

public class Iu {
	
	private String name;
	private int age;
	//fix-study
	private String test;
	
	private static Iu iu = null; //클래스 변수는 클래스 메서드에서 사용 가능
	//getInstance를 통해서 if문이 실행되면 iu는 더 이상 null이 아니다.
	
	private Iu() {}
	
//	public Iu haha() {
//		Iu iu = new Iu();
//		return iu;
//	}
	
	public static Iu getInstance() {
		//여기서 위에 있는 name과 age를 사용할 수 없다.
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Setter 선언 형식
	//public void set변수명(데이터타입 변수명(매개변수)) {}
	
	//Getter 선언 형식
	//public 리턴타입 get변수명() {}
	//Getter는 꺼내서 주기만 하면 되기 때문에 리턴은 필요없다.
	
	

}
