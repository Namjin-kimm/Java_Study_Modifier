package com.iu.main;

import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3};
		CollectionStack cs = new CollectionStack();
		nums = cs.add(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			}
		
		//test data set
		
		//1. com.iu.util.CollectionStack 클래스 선언
		//add - 입력 받은 새로운 숫자 추가 무조건 0번에 추가
		//remove - 0번 인덱스 삭제
		//CollectionStack.add -> {4,1,2,3}
		//CollectionStack.remove -> {2, 3}
		
		//2. com.iu.util.CollectionQue
		//add - 입력 받은 새로운 숫자 추가 무조건 0번에 추가
		//remove - 마지막 인덱스 번호 삭제
		//CollectionStack.add -> {1,2,3,4}
		//CollectionStack.remove -> {2, 3}
		
		//3. com.iu.util.CollectionSet
		//add - 새로운 숫자 추가 맨 뒤에 추가
		// 단 중복되지 않는 숫자만 추가
		//remove - 삭제할 숫자를 입력 받아서 일치하는 숫자 삭제
		
	}
}