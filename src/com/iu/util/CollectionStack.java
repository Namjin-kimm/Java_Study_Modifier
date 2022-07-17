package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection {
	
	//1. com.iu.util.CollectionStack 클래스 선언
			//add - 입력 받은 새로운 숫자 추가, 무조건 0번에 추가
			//remove - 0번 인덱스 삭제
	
	public int [] add(int [] numbers) {
		int [] numbersCopy = new int[numbers.length + 1];
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int index = 1;
		int i = 0;
		for(i = 0; i < numbers.length; i++) {
			numbersCopy[index] = numbers[i];
			index++;
		}
		System.out.println("추가할 숫자를 입력하세요");
		int count = sc.nextInt();
		numbersCopy[0] = count;
		
		return numbersCopy;
	}
	
	public int [] remove(int [] numbers) {
		
		return numbers;
	}
	
	

}
