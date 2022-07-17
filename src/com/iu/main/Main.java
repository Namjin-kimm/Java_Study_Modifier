package com.iu.main;

import java.util.Scanner;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3};
		CollectionStack cs = new CollectionStack();
		CollectionQue cq = new CollectionQue();
		CollectionSet ss = new CollectionSet();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
		System.out.println("1번 2번 3번 중에 선택하세요");
		int count = sc.nextInt();
		int count1;
		
		if(count == 1) {
		System.out.println("정보 추가 : 1, 원하는 번호 삭제 : 2");
		count1 = sc.nextInt();
		if(count1 == 1) {
		numbers = cs.add(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
				}
			}else {
			numbers = cs.remove(numbers);
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
					}
			}
		}else if(count == 2) {
			System.out.println("정보 추가 : 1, 마지막 인덱스 정보 삭제 : 2");
			count1 = sc.nextInt();
			if(count1 == 1) {
				numbers = cq.add(numbers);
				for(int i = 0; i < numbers.length; i++) {
					System.out.println(numbers[i]);
						}
			}else {
				numbers = cq.remove(numbers);
				for(int i = 0; i < numbers.length; i++) {
					System.out.println(numbers[i]);
						}
			}
		}else {
			System.out.println("정보 추가 : 1, 마지막 인덱스 정보 삭제 : 2");
			count1 = sc.nextInt();
			if(count1 == 1) {
			numbers = ss.add(numbers);
			for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
				}
			}else {
				numbers = ss.remove(numbers);
				for(int i = 0; i < numbers.length; i++) {
					System.out.println(numbers[i]);
						}
			}
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
}